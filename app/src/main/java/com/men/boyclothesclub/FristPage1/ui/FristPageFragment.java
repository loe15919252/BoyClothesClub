package com.men.boyclothesclub.FristPage1.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.R;

/**
 * Created by Administrator on 2016/5/23.
 */
public class FristPageFragment extends BaseFragment {

    private ListView lv;
    private LinearLayout ll;

    @Override
    protected String setTitle() {
        return "首页";
    }

    @Override
    protected int setRootLayout() {
        return R.layout.fragment_firstpage;
    }

    @Override
    protected void init(LayoutInflater inflater) {
        lv = (ListView) getRootLayout().findViewById(R.id.id_lv_frist);
        ll = (LinearLayout) inflater.inflate(R.layout.custom1_frist_top, null);
        lv.addHeaderView(ll);
    }

    @Override
    protected void initEvent() {

    }
}
