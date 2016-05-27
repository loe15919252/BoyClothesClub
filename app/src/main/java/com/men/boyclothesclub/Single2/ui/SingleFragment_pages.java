package com.men.boyclothesclub.Single2.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.Group3.utils.GroupRecyclerDecoration;
import com.men.boyclothesclub.R;
import com.men.boyclothesclub.Single2.ui.Adapter.RecyclerViewAdapter;
import com.men.boyclothesclub.Single2.ui.Adapter.SingleFrangmentAdapter;
import com.men.boyclothesclub.Single2.ui.bin.Single_Bin;
import com.men.boyclothesclub.Single2.ui.bin.Single_List_ben;
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

    private static final int SETLISTDATA=8551554;
    private static final int VERIFYDATABEN=553221;
    private static final String PATH="http://api.nanyibang.com/tuijian-product? age=24&system_name=android&versionCode=206&page=1&cateId=";
    private View singRoot , headerView;
    private int classID,position;
    private List<Single_Bin.DataBean> mDataBeen;
    private List<Single_List_ben.DataBean> mListBeen;
    private List<Single_Bin.DataBean.CategoriesBean> mCategories;
    private int Lieshu=4;
    private RecyclerViewAdapter rAdapter;
    private RecyclerView mRecycler;
    private LinearLayout mLayout;
    private LayoutInflater mInflate;


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
                        position=i;
                        LogUtil.w("classID+++"+classID);
                        i=mDataBeen.size()+10;

                    }
                }
                mCategories.addAll(mDataBeen.get(position).getCategories());
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        setHeaderData();
                    }
                });

            }else if (msg.what==SETLISTDATA){
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        rAdapter.notifyDataSetChanged();
                    }
                });
            }

        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // TODO: 2016/5/26 初始化，并获取加载控件
        singRoot = inflater.inflate(R.layout.fragment_single_viewpager, container, false);
        mInflate=inflater;
        classID = getArguments().getInt(SingleFrangmentAdapter.CLASSID);
        initData(inflater,container);
        getGsonBin(SingleFragment.URL);
        getListBeen(PATH+classID);
        StaggeredGridLayoutManager LayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecycler.setLayoutManager(LayoutManager);
        // TODO: 2016/5/25  给Item添加边距
        GroupRecyclerDecoration decoration=new GroupRecyclerDecoration(5);
        mRecycler.addItemDecoration(decoration);
        mRecycler.setAdapter(rAdapter);
        return singRoot;
    }

    private void initData(LayoutInflater inflater, ViewGroup container) {
        mRecycler = (RecyclerView) singRoot.findViewById(R.id.id_Single_pager_LinearLayout);
        headerView = inflater.inflate(R.layout.custom2_single_header_view, container, false);
        mLayout = (LinearLayout) headerView.findViewById(R.id.id_single_GridView);
        mListBeen=new ArrayList<>();
        mDataBeen = new ArrayList<>();
        mCategories = new ArrayList<>();
        rAdapter=new RecyclerViewAdapter(mListBeen,getContext(),headerView);
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


    public void getListBeen(String url) {
        // TODO: 2016/5/26 获得 GsonBin数据源
        OkHttpUtils.getRequest(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Single_List_ben single_list_ben = Single_List_ben.objectFromData(string);
                mListBeen.addAll(single_list_ben.getData());
                // TODO: 2016/5/26 加载数据源后发送通知
                Message message = new Message();
                message.what =SETLISTDATA;
                handler.handleMessage(message);
            }
        });
    }


    private void setHeaderData() {
        // TODO: 2016/5/27 动态加载头部数据
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1);
            View lin_item = mInflate.inflate(R.layout.group_header_lin_item, null);
            LinearLayout lin_layout = (LinearLayout) lin_item.findViewById(R.id.id_Group_header_horizontal_layout);

            for (int i = 0; i < mCategories.size(); i++) {
                View inflate = mInflate.inflate(R.layout.custom2_single_header_item, null);
                inflate.setLayoutParams(lp);
                TextView tv = (TextView) inflate.findViewById(R.id.id_single_item_tv);
                ImageView iv = (ImageView) inflate.findViewById(R.id.id_single_item_iv);
                tv.setText(mCategories.get(i).getName());
                Picasso.with(getActivity())
                        .load(mCategories.get(i).getCateimg())
                        .error(R.drawable.house_photoview_pic_fail)
                        .into(iv);
                lin_layout.addView(inflate);
                    if (i % Lieshu == Lieshu-1) {
                        mLayout.addView(lin_item);
                        lin_item = mInflate.inflate(R.layout.group_header_lin_item, null);
                        lin_layout = (LinearLayout) lin_item.findViewById(R.id.id_Group_header_horizontal_layout);

                }
            }

            if (lin_layout.getChildCount()!=0) {
                for (int i = 0; i <= Lieshu - lin_layout.getChildCount(); i++) {
                    Log.e("----", "setHeaderData: " + Lieshu + "-" + lin_layout.getChildCount());
                    View v = new View(getActivity());
                    v.setLayoutParams(lp);
                    lin_layout.addView(v);
                }
                mLayout.addView(lin_item);
            }

    }
}