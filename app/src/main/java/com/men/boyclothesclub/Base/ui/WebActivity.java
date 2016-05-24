package com.men.boyclothesclub.Base.ui;

import android.content.Intent;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.men.boyclothesclub.Base.utils.Constont;
import com.men.boyclothesclub.R;

public class WebActivity extends BaseActivity {

    private WebView mWebView;

    @Override
    protected int setRootView() {
        return R.layout.activity_web;
    }

    @Override
    protected void init() {
        mWebView = (WebView) findViewById(R.id.id_webView);
        Intent intent = getIntent();
        String url = intent.getStringExtra(Constont.TAG_WEB_URL);
        mWebView.loadUrl(url);
        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
    }

    @Override
    protected void initEvent() {

    }

}
