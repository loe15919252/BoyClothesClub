package com.men.boyclothesclub.Single2.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.men.boyclothesclub.Base.adapter.CommonAdapter;
import com.men.boyclothesclub.Base.adapter.ViewHolder;
import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.R;
import com.men.boyclothesclub.Single2.ui.Adapter.SingleFrangmentAdapter;
import com.men.boyclothesclub.Single2.ui.bin.Single_Bin;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/5/26.
 */
public class SingleFragment_pages extends Fragment {

    private static final int VERIFYDATABEN=553221;
    private View singRoot , headerView;
    private int classID;
    private List<Single_Bin.DataBean> mDataBeen;
    private List<Single_Bin.DataBean.CategoriesBean> mCategories;
    private CommonAdapter adapter;
    private LinearLayout mLinearLayout;
    private GridView mGridView;


    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==VERIFYDATABEN)
            {
                // TODO: 2016/5/26 判断并获取当前页码
                for (int i = 0; i <mDataBeen.size(); i++) {
                     
                    if (mDataBeen.get(i).getClassID()==classID)
                    {
                        classID=i;
                        LogUtil.w("classID+++"+classID);
                        i=mDataBeen.size()+10;
                    }
                }
                mCategories.addAll(mDataBeen.get(classID).getCategories());
                try{
                    Log.e("--------","Thread:"+Thread.currentThread().getName());
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            adapter.notifyDataSetChanged();
                        }
                    });
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // TODO: 2016/5/26 初始化，并获取加载控件
        singRoot = inflater.inflate(R.layout.fragment_single_viewpager, container, false);
        classID = getArguments().getInt(SingleFrangmentAdapter.CLASSID);
        LogUtil.i("classID="+classID);

            mLinearLayout = (LinearLayout) singRoot.findViewById(R.id.id_Single_pager_LinearLayout);
            headerView = inflater.inflate(R.layout.custom2_single_header_view, container, false);
            mGridView = (GridView) headerView.findViewById(R.id.id_single_GridView);

            mDataBeen = new ArrayList<>();
            mCategories = new ArrayList<>();
            getGsonBin(SingleFragment.URL);
            adapter = new CommonAdapter<Single_Bin.DataBean.CategoriesBean>(R.layout.custom2_single_header_item, mCategories, getActivity()) {
                @Override
                public void setContent(ViewHolder vh, Single_Bin.DataBean.CategoriesBean item) {
                    ImageView aImageView = (ImageView) vh.getViews(R.id.id_single_item_iv);
                    TextView aTextView = (TextView) vh.getViews(R.id.id_single_item_tv);
                    aTextView.setText(item.getName());
                    Picasso.with(getActivity())
                            .load(item.getCateimg())
                            .error(R.drawable.house_photoview_pic_fail)
                            .into(aImageView);
                }
            };
            mLinearLayout.addView(headerView);
            mGridView.setAdapter(adapter);

        return singRoot;
    }


    @Override
    public void onResume() {
        super.onResume();

    }

    public void getGsonBin(String url) {
        // TODO: 2016/5/26 获得 GsonBin数据源
        OkHttpUtils.getRequest(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Single_Bin single_bin = Single_Bin.objectFromData(string);
                mDataBeen.addAll(single_bin.getData());
                // TODO: 2016/5/26 加载数据源后发送通知
                Message message = new Message();
                message.what =VERIFYDATABEN;
                handler.handleMessage(message);
            }
        });
    }
}