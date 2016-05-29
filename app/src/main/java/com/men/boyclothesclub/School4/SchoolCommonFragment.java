package com.men.boyclothesclub.School4;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.men.boyclothesclub.Base.adapter.CommonAdapter;
import com.men.boyclothesclub.Base.adapter.ViewHolder;
import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.FristPage1.bean.BrandBean;
import com.men.boyclothesclub.R;
import com.men.boyclothesclub.School4.bean.SchoolDataBean;
import com.men.boyclothesclub.School4.utils.SchoolConstont;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;


/**
 * Created by Administrator on 2016/5/26.
 */
public class SchoolCommonFragment extends BaseFragment {

    private ListView listView;
    private CommonAdapter<SchoolDataBean.DataBean> adapter;
    private List<SchoolDataBean.DataBean> list;
    private String url;
    private String index;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case SchoolConstont.SCHOOL_DATA_MSG1:
                    SchoolDataBean bean = SchoolDataBean.objectFromData(msg.obj.toString());
                    list = bean.getData();
                    LogUtil.e("----mes  "+list.get(0).getTitle());
                    adapter.notifyDataSetChanged();
                    break;
            }
        }
    };


    public SchoolCommonFragment(String index) {
        this.index = index;
        url = SchoolConstont.SCHOOL_URL_DATA + "&page=1&kind=" + index;
    }

    @Override
    protected String setTitle() {
        return null;
    }

    @Override
    protected int setRootLayout() {
        return R.layout.fragment_school_viewpager;
    }

    @Override
    protected void init(LayoutInflater inflater) {

        listView = (ListView) rootView.findViewById(R.id.id_lv_school);
        list = new ArrayList<>();
//        adapter = new CommonAdapter<SchoolDataBean.DataBean>
//                  (R.layout.custom4_school_item,list,getActivity()) {
//            @Override
//            public void setContent(ViewHolder vh, SchoolDataBean.DataBean item) {
//                vh.setTextViewText(R.id.id_tv_school,"asdasdasd");
//                ImageView iv = (ImageView) vh.getViews(R.id.id_iiv_school);
//                Picasso.with(getActivity()).load(R.mipmap.ic_launcher).into(iv);
//            }
//        };
        adapter = new CommonAdapter<SchoolDataBean.DataBean>
                (R.layout.custom1_frist_brand_item,list,getActivity()) {
            @Override
            public void setContent(ViewHolder vh, SchoolDataBean.DataBean item) {
                vh.setTextViewText(R.id.id_tv_brand, "123123123");
                ImageView iv = (ImageView) vh.getViews(R.id.id_iv_brand);
                Picasso.with(getActivity()).load(item.getImage()).into(iv);
            }
        };
        listView.setAdapter(adapter);
//        mDataAdapter = new CommonAdapter<SchoolDataBean.DataBean>(
//                R.layout.custom4_school_item, mDataList, getActivity()) {
//            @Override
//            public void setContent(ViewHolder vh, final SchoolDataBean.DataBean item) {
//                vh.setTextViewText(R.id.id_four_item_title,"asdsadasd");
//                ImageView iv = (ImageView) vh.getViews(R.id.id_four_item_iv);
//                Picasso.with(getActivity()).load(item.getImage()).into(iv);
//            }
//        };
//        mListview.setAdapter(mDataAdapter);

        OkHttpUtils.getRequest(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody body = response.body();
                String json  = body.string();
                Message message = Message.obtain();
                message.what = SchoolConstont.SCHOOL_DATA_MSG1;
                message.obj = json;
                handler.sendMessage(message);
            }
        });

    }


    @Override
    protected void initEvent() {

    }


}
