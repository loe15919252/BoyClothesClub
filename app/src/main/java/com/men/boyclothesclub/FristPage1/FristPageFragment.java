package com.men.boyclothesclub.FristPage1;

import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.men.boyclothesclub.Base.adapter.ViewPagerCommonAdapter;
import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.FristPage1.bean.ViewPagerBean;
import com.men.boyclothesclub.FristPage1.utils.FristConstont;
import com.men.boyclothesclub.MainActivity;
import com.men.boyclothesclub.R;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by Administrator on 2016/5/23.
 */
public class FristPageFragment extends BaseFragment {

    private ListView lv;
    private LinearLayout ll;
    private ViewPager viewPager;
    private ViewPagerCommonAdapter viewPagerAdapter;
    private List<ImageView> list;
    private List<ViewPagerBean.DataBean> listBean;
    private int indexVp;
    private Timer timer;
    private TimerTask timerTask;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    indexVp %= 3;
//                    viewPager.setCurrentItem(indexVp);
                    indexVp++;
                    break;
            }
        }
    };
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
        setData();
        setViewPager();
        setTime();
    }

    private void setTime() {
        timerTask = new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(1);
            }
        };
        timer = MainActivity.getTimer();
        timer.schedule(timerTask, 2000, 1500);
    }

    private void setViewPager() {
        viewPager = (ViewPager) ll.findViewById(R.id.id_vp_first);
        list = new ArrayList<>();
        listBean = new ArrayList<>();
        OkHttpUtils.getRequest(FristConstont.VIEWPAGE, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtil.e("ViewPage请求出错");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody body = response.body();
                String url = body.string();
//                LogUtil.e("连接成功 viewPager:" + url);
//                ViewPagerBean bean = ViewPagerBean.objectFromData(url);
//                listBean.addAll(bean.getData());
//                list.clear();
//                for (int i = 0; i < listBean.size(); i++) {
//                    String urlImg = listBean.get(i).getTheme_image();
//                    ImageView imageView = new ImageView(getActivity());
//                    Picasso.with(getActivity()).load(urlImg).into(imageView);
//                    list.add(imageView);
//                }
//                viewPagerAdapter = new ViewPagerCommonAdapter
//                        (list, getActivity(), listBean);
//                viewPager.setAdapter(viewPagerAdapter);
//                viewPagerAdapter.notifyDataSetChanged();
            }
        });

    }

    @Override
    protected void initEvent() {

    }

    public void setData() {
        OkHttpUtils.getRequest(FristConstont.TOPICON, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtil.e("连接错误");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody body = response.body();
                LogUtil.e("连接成功，topIcon：" + body.string());
            }
        });
    }
}
