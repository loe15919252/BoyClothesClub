package com.men.boyclothesclub.Single2.ui;

import android.os.Handler;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;

import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.R;
import com.men.boyclothesclub.Single2.ui.Adapter.SingleFrangmentAdapter;
import com.men.boyclothesclub.Single2.ui.bin.Single_Bin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/5/26.
 */
public class SingleFragment extends BaseFragment {

    private static final int SINGLE_STARTER_ADAPTER=55455;
    public static final String URL="http://api.nanyibang.com/select-condition?age=24&system_name=android&versionCode=206";


    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    SingleFrangmentAdapter adapter;

    private List<Single_Bin.DataBean> mDataBeen;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case SINGLE_STARTER_ADAPTER:
                    // TODO: 2016/5/26 得到标识后进行数据更新
                    adapter.notifyDataSetChanged();
                    break;
            }
        }
    };

  

    @Override
    protected void init(LayoutInflater inflater) {
        // TODO: 2016/5/26 初始化 
        mTabLayout= (TabLayout) rootView.findViewById(R.id.id_Single_TabLayou);
        mViewPager= (ViewPager) rootView.findViewById(R.id.id_fragmeng_single_viewpager);
        mDataBeen=new ArrayList<>();
        adapter = new SingleFrangmentAdapter(
                getActivity().getSupportFragmentManager(),
                mDataBeen);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
        // TODO: 2016/5/26 加载数据
        getGsonBin(URL);
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected int setRootLayout() {
        return R.layout.fragment_single;
    }
    @Override
    protected String setTitle() {
        return "单品";
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
                Message message=new Message();
                message.what=SINGLE_STARTER_ADAPTER;
                handler.handleMessage(message);
            }
        });
    }
}
