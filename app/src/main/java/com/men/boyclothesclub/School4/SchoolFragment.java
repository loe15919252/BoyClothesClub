package com.men.boyclothesclub.School4;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;

import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.R;
import com.men.boyclothesclub.School4.utils.SchoolConstont;
import com.men.boyclothesclub.Single2.ui.SingleCommonFragment;
import com.men.boyclothesclub.Single2.ui.common.SingleConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/23.
 */
public class SchoolFragment extends BaseFragment {
    private int mTabNum = mTabString.length;   // Tab标签的数量
    // Tab 标签的字符
    private static String mTabString[] = new String[]{
            SchoolConstont.SCHOOL_TAB_HOT,               //最热
            SchoolConstont.SCHOOL_TAB_MATCH,             //搭配
            SchoolConstont.SCHOOL_TAB_HAIRSTYLE,         //发型
            SchoolConstont.SCHOOL_TAB_SKINCARE,         //护肤
            SchoolConstont.SCHOOL_TAB_FITNESS,           //健身
            SchoolConstont.SCHOOL_TAB_STAR              //明星

    };
    // tab 标签的url
    private String mUrlStr[] = new String[]{
            SchoolConstont.SCHOOL_URL_HOT,              // 最热
            SchoolConstont.SCHOOL_URL_MATCH,            // 搭配
            SchoolConstont.SCHOOL_URL_HAIRSTYLE,        // 发型
            SchoolConstont.SCHOOL_URL_SKINCARE,         // 护肤
            SchoolConstont.SCHOOL_URL_FITNESS,          // 健身
            SchoolConstont.SCHOOL_URL_STAR              // 明星
    };


    private TabLayout mTab;             // 标签
    private ViewPager mViewPager;       // 可滚动部分

    // fragment
    private List<Fragment> fragments;



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
        initTab();
        initData();

    }



    private void initTab() {
    // TODO: 2016.05.26 初始化控件
        mTab = (TabLayout) getRootLayout().findViewById(R.id.id_fragmeng_school_tabLayout);
        mViewPager = (ViewPager) getRootLayout().findViewById(R.id.id_fragmeng_school_viewpager);
        // 设置数据源
        fragments = new ArrayList<>();
        for (int i = 0; i < mTabNum; i++) {
            SchoolCommonFragment schoolFragment = new SchoolCommonFragment(mUrlStr[i]);
            fragments.add(schoolFragment);
        }

        mViewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
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
                return mTabString[position];
            }
        });

        mTab.setupWithViewPager(mViewPager);
        //设置 Tab属性
        mTab.setSelectedTabIndicatorColor(Color.GRAY);
        mTab.setTabGravity(TabLayout.GRAVITY_CENTER);
        mTab.setTabMode(TabLayout.MODE_SCROLLABLE);

    }

    private void initData() {

    }


    @Override
    protected void initEvent() {

    }
}
