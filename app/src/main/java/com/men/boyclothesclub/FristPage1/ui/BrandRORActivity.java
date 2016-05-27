package com.men.boyclothesclub.FristPage1.ui;


import com.men.boyclothesclub.Base.ui.TabBaseActivity;

import java.util.ArrayList;
import java.util.List;


public class BrandRORActivity extends TabBaseActivity {

    protected List<String> titleList;

    @Override
    protected String setTitle() {
        return "ROR";
    }

    @Override
    protected List<String> setTabString() {
        titleList = new ArrayList<>();
        titleList.add("上衣");
        titleList.add("裤子");
        return titleList;
    }


    @Override
    protected void initEvent() {

    }
}
