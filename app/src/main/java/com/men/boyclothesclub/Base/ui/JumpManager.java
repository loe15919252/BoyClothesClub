package com.men.boyclothesclub.Base.ui;

import android.app.Activity;
import android.content.Intent;

import com.men.boyclothesclub.Base.utils.Constont;
import com.men.boyclothesclub.MainActivity;

/**
 * created dpb on 16/4/13.
 * <p/>
 * e_mail  dengpbs@163.com.
 * 页面跳转管理
 */
public class JumpManager {

    /**
     * 跳转到主页面
     *
     * @param activity
     */
    public static void jumpToMain(Activity activity) {
        Intent intent = new Intent(activity, MainActivity.class);
        activity.startActivity(intent);

    }


    public static void jumpToWebView(Activity activity, String url) {
        Intent intent = new Intent(activity, WebActivity.class);
        intent.putExtra(Constont.TAG_WEB_URL, url);
        activity.startActivity(intent);
    }
}
