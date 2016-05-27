package com.men.boyclothesclub.School4;

import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;

import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.R;
import com.men.boyclothesclub.School4.bean.SchoolInitBean;
import com.men.boyclothesclub.School4.utils.SchoolConstont;
import com.men.boyclothesclub.Single2.ui.common.SingleConstants;
import com.squareup.okhttp.OkHttpClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by Administrator on 2016/5/23.
 */
public class SchoolFragment extends BaseFragment {
    private int mTabNum ;   // Tab标签的数量
    // Tab 标签的字符
    private List<String> title;
    // tab 标签的url
    private List<String> index;
    private FragmentPagerAdapter adapter;


    private TabLayout mTab;             // 标签
    private ViewPager mViewPager;       // 可滚动部分

    // fragment
    private List<Fragment> fragments;
    private SchoolCommonFragment schoolFragment;


    public Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case SchoolConstont.SCHOOL_MSG:
                    LogUtil.e(msg.obj.toString());
                    SchoolInitBean initBean = SchoolInitBean.objectFromData(msg.obj.toString());
                    mTabNum = initBean.getData().size();

                    for(int i = 0 ;i<mTabNum;i++){
                        title.add(initBean.getData().get(i).getTitle());
                    }

                    for (int i = 0 ; i<mTabNum;i++){
                        index.add(initBean.getData().get(i).getKind_id()+"");
                    }

                    // 获取每个 fragment 中的地址
                    for (int i = 0; i < mTabNum; i++) {
                        SchoolCommonFragment schoolFragment = new SchoolCommonFragment(index.get(i));
                        fragments.add(schoolFragment);
                    }
                    // 将获取到的 TAB 标签信息，加到适配器中
                    adapter.notifyDataSetChanged();
                break;
            }
        }
    };


    private void setInit() {
        // 根据 标题地址 SCHOOL_URL_INIT，获取 TAB 标题的信息
        OkHttpUtils.getRequest(SchoolConstont.SCHOOL_URL_INIT, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            // 请求成功
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody body = response.body();   // 异步请求获得的数据
                String json = body.string();          // 转换为字符

                Message message = Message.obtain();
                message.what = SchoolConstont.SCHOOL_MSG;
                message.obj = json;
                handler.sendMessage(message);
            }
        });

    }


    @Override
    protected String setTitle() {
        return "穿衣学堂";
    }

    @Override
    protected int setRootLayout() {
        return R.layout.fragment_school;
    }

    @Override
    protected void init(LayoutInflater inflater) {
        title = new ArrayList<>();
        index = new ArrayList<>();
        mTabNum= title.size();
        initViewPage();
        setInit();
    }


    private void initViewPage() {
    // TODO: 2016.05.26 初始化控件
        mTab = (TabLayout) getRootLayout().findViewById(R.id.id_fragmeng_school_tabLayout);
        mViewPager = (ViewPager) getRootLayout().findViewById(R.id.id_fragmeng_school_viewpager);
        // 设置数据源
        fragments = new ArrayList<>();
        index = new ArrayList<>();
        for (int i = 0; i < mTabNum; i++) {
            SchoolCommonFragment schoolFragment = new SchoolCommonFragment("");
            fragments.add(schoolFragment);
        }

        adapter = new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return title.get(position);
            }
        };
        mViewPager.setAdapter(adapter);

        mTab.setupWithViewPager(mViewPager);
        //设置 Tab属性
        mTab.setSelectedTabIndicatorColor(Color.GRAY);
        mTab.setTabGravity(TabLayout.GRAVITY_CENTER);
        mTab.setTabMode(TabLayout.MODE_SCROLLABLE);
    }


    @Override
    protected void initEvent() {

    }
}
