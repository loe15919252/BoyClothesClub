package com.men.boyclothesclub.FristPage1;

import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.men.boyclothesclub.Base.adapter.ViewPagerCommonAdapter;
import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.FristPage1.bean.TagBean;
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
    private int topRes[] = new int[]{R.id.id_iv_top1,R.id.id_iv_top2,R.id.id_iv_top3,R.id.id_iv_top4};
    private int topTVRes[] = new int[]{R.id.id_tv_top1,R.id.id_tv_top2,R.id.id_tv_top3,R.id.id_tv_top4};
    public Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    indexVp %= 3;
                    viewPager.setCurrentItem(indexVp);
                    indexVp++;
                    break;
                case 666:
                    String url = msg.obj.toString();
                    ViewPagerBean bean = ViewPagerBean.objectFromData(url);
                    listBean.addAll(bean.getData());
                    list.clear();
                    for (int i = 0; i < listBean.size(); i++) {
                        try {
                            String urlImg = listBean.get(i).getTheme_image();
                            ImageView imageView = new ImageView(getActivity());
                            imageView.setLayoutParams(lp);
//                        imageView.setTag(urlImg);
                            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                            imageView.setImageResource(R.mipmap.ic_launcher);
                            OkHttpUtils.setImage(urlImg, imageView);
                            list.add(imageView);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    viewPagerAdapter = new ViewPagerCommonAdapter
                            (list, getActivity(), listBean);
                    viewPager.setAdapter(viewPagerAdapter);
                    break;
                case 888:
                    TagBean t = (TagBean) msg.obj;
                    for (int i = 0; i < 4; i++) {
                        try {
                            String urlImg = t.getData().get(i).getTheme_image();
                            ImageView iv = (ImageView) ll.findViewById(topRes[i]);
                            TextView tv = (TextView) ll.findViewById(topTVRes[i]);
                            OkHttpUtils.setImage(urlImg,iv);
                            tv.setText(t.getData().get(i).getTheme_name());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
        }
    };
    private ViewGroup.LayoutParams lp;

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
        lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
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
        OkHttpUtils.getRequest(FristConstont.URL_VIEWPAGE, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtil.e("ViewPage请求出错");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody body = response.body();
                String url = body.string();
                Message message = Message.obtain();
                message.what = 666;
                message.obj = url;

                handler.sendMessage(message);
            }
        });

    }

    @Override
    protected void initEvent() {

    }

    public void setData() {
        OkHttpUtils.getRequest(FristConstont.URL_TOPICON, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtil.e("连接错误");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody body = response.body();
                String url = body.string();
                LogUtil.e("连接成功，topIcon：" + url);
                TagBean bean = TagBean.objectFromData(url);
                Message message = Message.obtain();
                message.obj = bean;
                message.what = 888;
                handler.sendMessage(message);
            }
        });
    }
}
