package com.men.boyclothesclub.FristPage1.ui;


import com.men.boyclothesclub.Base.ui.TabBaseActivity;

import java.util.ArrayList;
import java.util.List;

public class BrandGXGActivity extends TabBaseActivity {

    protected List<String> titleList;

    @Override
    protected void initEvent() {

    }

    @Override
    protected String setTitle() {
        return "GXG";
    }

    @Override
    protected List<String> setTabString() {
        titleList = new ArrayList<>();
        titleList.add("上衣");
        titleList.add("裤子");
        return titleList;
    }
}
