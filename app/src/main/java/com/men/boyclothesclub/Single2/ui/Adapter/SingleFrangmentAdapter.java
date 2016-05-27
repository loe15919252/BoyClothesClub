package com.men.boyclothesclub.Single2.ui.Adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;

import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Single2.ui.SingleFragment_pages;
import com.men.boyclothesclub.Single2.ui.bin.Single_Bin;

import java.util.List;

/**
 * Created by Administrator on 2016/5/26.
 */
public class SingleFrangmentAdapter extends FragmentPagerAdapter {
    public static final String CLASSID="classID";

    private List<Single_Bin.DataBean> mDataBeen;
    private FragmentManager manager;

    public SingleFrangmentAdapter(FragmentManager fm, List<Single_Bin.DataBean> mDataBeen) {
        super(fm);
        this.mDataBeen = mDataBeen;
        this.manager = fm;
    }

    @Override
    public Fragment getItem(int position) {
        FragmentTransaction tran=manager.beginTransaction();
        SingleFragment_pages pages=new SingleFragment_pages();
        Bundle b=new Bundle();
        LogUtil.i("适配器运行");
        b.putInt(CLASSID,mDataBeen.get(position).getClassID());
        pages.setArguments(b);
        return pages;
    }

    @Override
    public int getCount() {
        return mDataBeen.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mDataBeen.get(position).getName();
    }
}
