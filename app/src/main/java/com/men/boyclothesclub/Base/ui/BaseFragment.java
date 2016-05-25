package com.men.boyclothesclub.Base.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.men.boyclothesclub.R;


/**
 * Fragment的基类
 */
public abstract class BaseFragment extends Fragment {
    protected TextView title;
    protected View rootView;
    protected LayoutInflater inflater;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(setRootLayout(), null);
        this.inflater = inflater;
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        title = (TextView) rootView.findViewById(R.id.id_toolbar_title);
        title.setText(setTitle() != null ? setTitle() : "男人邦");
        init(inflater);
        initEvent();
        Log.e("-----", "onCreateView: ");
    }

    protected abstract String setTitle();

    protected abstract int setRootLayout();

    protected View getRootLayout() {
        return rootView;
    }


    /**
     * 初始化数据在onCreateView执行
     */
    protected abstract void init(LayoutInflater inflater);

    /**
     * 初始化触发事件在onCreateView执行
     */
    protected abstract void initEvent();
}
