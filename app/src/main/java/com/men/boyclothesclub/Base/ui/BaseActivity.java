package com.men.boyclothesclub.Base.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.men.boyclothesclub.R;

/**
 * Created by Administrator on 2016/5/23.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setRootView());
        init();
        initEvent();
    }

    protected abstract int setRootView();

    protected abstract void init();

    protected abstract void initEvent();

}
