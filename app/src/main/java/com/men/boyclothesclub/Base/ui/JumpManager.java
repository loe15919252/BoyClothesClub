package com.men.boyclothesclub.Base.ui;

import android.app.Activity;
import android.content.Intent;

import com.men.boyclothesclub.Base.utils.Constont;
import com.men.boyclothesclub.FristPage1.ui.BrandGXGActivity;
import com.men.boyclothesclub.FristPage1.ui.BrandRORActivity;
import com.men.boyclothesclub.FristPage1.ui.BrandSIMActivity;
import com.men.boyclothesclub.FristPage1.ui.BrandUNIActivity;
import com.men.boyclothesclub.FristPage1.ui.BrandUOActivity;
import com.men.boyclothesclub.FristPage1.ui.BrandVISHOWActivity;
import com.men.boyclothesclub.FristPage1.ui.MatchActivity;
import com.men.boyclothesclub.FristPage1.ui.ShopCPActivity;
import com.men.boyclothesclub.FristPage1.ui.ShopRCActivity;
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
    public static void jumpToBrandROR(Activity activity, String tag) {
        Intent intent = new Intent(activity, BrandRORActivity.class);
        intent.putExtra(Constont.TAG_BRAND_URL, tag);
        activity.startActivity(intent);
    }
    public static void jumpToBrandUO(Activity activity, String tag) {
        Intent intent = new Intent(activity, BrandUOActivity.class);
        intent.putExtra(Constont.TAG_BRAND_URL, tag);
        activity.startActivity(intent);
    }
    public static void jumpToBrandVISHOW(Activity activity, String tag) {
        Intent intent = new Intent(activity, BrandVISHOWActivity.class);
        intent.putExtra(Constont.TAG_BRAND_URL, tag);
        activity.startActivity(intent);
    }
    public static void jumpToBrandUNI(Activity activity, String tag) {
        Intent intent = new Intent(activity, BrandUNIActivity.class);
        intent.putExtra(Constont.TAG_BRAND_URL, tag);
        activity.startActivity(intent);
    }
    public static void jumpToBrandSIM(Activity activity, String tag) {
        Intent intent = new Intent(activity, BrandSIMActivity.class);
        intent.putExtra(Constont.TAG_BRAND_URL, tag);
        activity.startActivity(intent);
    }
    public static void jumpToBrandGXG(Activity activity, String tag) {
        Intent intent = new Intent(activity, BrandGXGActivity.class);
        intent.putExtra(Constont.TAG_BRAND_URL, tag);
        activity.startActivity(intent);
    }

    public static void jumpToMatch(Activity activity, String url) {
        Intent intent = new Intent(activity, MatchActivity.class);
        intent.putExtra(Constont.TAG_MACTH_URL, url);
        activity.startActivity(intent);
    }
    public static void jumpToWebView(Activity activity, String url) {
        Intent intent = new Intent(activity, WebActivity.class);
        intent.putExtra(Constont.TAG_WEB_URL, url);
        activity.startActivity(intent);
    }
    public static void jumpToShopCPView(Activity activity) {
        Intent intent = new Intent(activity, ShopCPActivity.class);
        activity.startActivity(intent);
    }
    public static void jumpToShopRCView(Activity activity) {
        Intent intent = new Intent(activity, ShopRCActivity.class);
        activity.startActivity(intent);
    }

}
