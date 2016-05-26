package com.men.boyclothesclub.Base.ui;

import android.content.Intent;
import android.graphics.Color;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.men.boyclothesclub.Base.utils.Constont;
import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.FristPage1.bean.BrandBean;
import com.men.boyclothesclub.FristPage1.ui.BrandRORFragment;
import com.men.boyclothesclub.FristPage1.utils.FristConstont;
import com.men.boyclothesclub.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by Administrator on 2016/5/26.
 */
public abstract class TabBaseActivity extends BaseActivity {

    protected TextView title;
    protected TabLayout tabLayout;
    protected ViewPager viewPager;
    protected List<String> titleList;
    protected List<BrandBean.DataBean> list;
    protected List<Fragment> fragmentList;
    @Override
    protected int setRootView() {
        return R.layout.activity_commontab;
    }

    @Override
    protected void init() {
        String i = setTitle();
        title = (TextView) findViewById(R.id.id_toolbar_title_common);
        if (title != null) {
            title.setText(i != null ? i : "男人邦");
        }
        ///////
        fragmentList = new ArrayList<>();
        titleList=setTabString();
        Intent intent = getIntent();
        String tag = intent.getExtras().getString(Constont.TAG_BRAND_URL).toString();
        String url1 = FristConstont.URL_OTHER_BRAND + tag + "&cate_id=1 &page=1";
        String url2 = FristConstont.URL_OTHER_BRAND + tag + "&cate_id=2 &page=1";
        final BrandRORFragment fragment1 = new BrandRORFragment(list);
        final BrandRORFragment fragment2 = new BrandRORFragment(list);
        OkHttpUtils.getRequest(url1, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtil.e("Brand连接失败");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody body = response.body();
                String url = body.string();
                Message message = Message.obtain();
                message.what = FristConstont.HANDER_TAG_BRAND;
                message.obj = url;
                fragment1.handler.sendMessage(message);
            }
        });
        OkHttpUtils.getRequest(url2, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtil.e("Brand连接失败");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody body = response.body();
                String url = body.string();
                Message message = Message.obtain();
                message.what = FristConstont.HANDER_TAG_BRAND;
                message.obj = url;
                fragment2.handler.sendMessage(message);
            }
        });

        fragmentList.add(fragment1);
        fragmentList.add(fragment2);

        ///////
        tabLayout = (TabLayout) findViewById(R.id.id_tab_common);
        viewPager = (ViewPager) findViewById(R.id.id_vp_common);
        tabLayout.setSelectedTabIndicatorColor(Color.GRAY);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        viewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragmentList.get(position);
            }

            @Override
            public int getCount() {
                return fragmentList.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return titleList.get(position);
            }
        });
        tabLayout.setupWithViewPager(viewPager);

    }

    protected abstract String setTitle();

    protected abstract List<String> setTabString();


}
