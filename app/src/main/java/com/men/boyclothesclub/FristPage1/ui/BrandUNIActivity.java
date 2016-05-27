package com.men.boyclothesclub.FristPage1.ui;


import com.men.boyclothesclub.Base.ui.TabBaseActivity;

import java.util.ArrayList;
import java.util.List;

public class BrandUNIActivity extends TabBaseActivity {

    protected List<String> titleList;

    @Override
    protected void initEvent() {

    }

    @Override
    protected String setTitle() {
        return "优衣库官方旗舰店";
    }

    @Override
    protected List<String> setTabString() {
        titleList = new ArrayList<>();
        titleList.add("上衣");
        titleList.add("裤子");
        return titleList;
    }
}
