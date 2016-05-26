package com.men.boyclothesclub.Single2.ui;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;

import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.R;
import com.men.boyclothesclub.Single2.ui.Adapter.RecyclerViewAdapter;
import com.men.boyclothesclub.Single2.ui.bin.Group_bin;
import com.men.boyclothesclub.Single2.ui.common.SingleConstants;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/5/23.
 */
public class SingleFragment extends BaseFragment {

    private Toolbar toolbar;
    private int mTabNum = mTabString.length;   // Tab标签的数量
    // Tab 标签的字符
    private static String mTabString[] = new String[]{
            SingleConstants.TAB_COAT,         //上衣
            SingleConstants.TAB_TROUSERS,     //裤子
            SingleConstants.TAB_SHOE,         //鞋子
            SingleConstants.TAB_DECORATION,   //配饰
            SingleConstants.TAB_MAN_BAG       //男包

    };
    // tab 标签的url
    private String mUrlStr[] = new String[]{
            SingleConstants.SINGLE_URL_COAT,          // 上衣
            SingleConstants.SINGLE_URL_TROUSERS,      // 裤子
            SingleConstants.SINGLE_URL_SHOE,          // 鞋子
            SingleConstants.SINGLE_URL_DECORATION,   // 配饰
            SingleConstants.SINGLE_URL_MAN_BAG        // 男包
    };

    private TabLayout mTab;             // 标签
    private ViewPager mViewPager;       // 可滚动部分
    private RecyclerView mRecyclerView;   // 可滚动部分
    private RecyclerViewAdapter adapter;
    // fragment
    private List<Fragment> fragments;
    private List<Group_bin.DataBean> mList;
    private Group_bin groupBin;

    @Override
    protected String setTitle() {
        return "单品";
    }

    @Override
    protected int setRootLayout() {
        return R.layout.fragment_single;
    }

    @Override
    protected void init(LayoutInflater inflater) {

        initTab();
        initData();
    }

    private void initTab() {
        // TODO: 2016.05.25 初始化控件
        mTab = (TabLayout) getRootLayout().findViewById(R.id.id_fragmeng_single_tabLayout);
        mViewPager = (ViewPager) getRootLayout().findViewById(R.id.id_fragmeng_single_viewpager);
        // 设置数据源
        fragments = new ArrayList<>();
        for (int i = 0; i < mTabNum; i++) {
            SingleCommonFragment singleFragment = new SingleCommonFragment(mUrlStr[i]);
            fragments.add(singleFragment);
        }

        mViewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public int getCount() {
                return fragments.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mTabString[position];
            }

            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

        });

        mTab.setupWithViewPager(mViewPager);
        //设置 Tab属性
        mTab.setSelectedTabIndicatorColor(Color.GRAY);
        mTab.setTabGravity(TabLayout.GRAVITY_CENTER);
        mTab.setTabMode(TabLayout.MODE_SCROLLABLE);
    }


    private void initData() {
        mList = new ArrayList<>();
        // TODO: 2016.05.25 初始化数据
        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(mUrlStr[0])
                .build();

        Call call = httpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                groupBin = Group_bin.objectFromData(string);
                mList.addAll(groupBin.getData());
            }
        });

    }


    @Override
    protected void initEvent() {
        // 关联


    }
}
