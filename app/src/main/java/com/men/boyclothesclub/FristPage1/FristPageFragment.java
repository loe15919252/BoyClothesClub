package com.men.boyclothesclub.FristPage1;

import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.men.boyclothesclub.Base.adapter.ViewPagerCommonAdapter;
import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.FristPage1.adapter.FristRecyclerAdapter;
import com.men.boyclothesclub.FristPage1.bean.FristBean;
import com.men.boyclothesclub.FristPage1.bean.OtherBean;
import com.men.boyclothesclub.FristPage1.bean.ShopBean;
import com.men.boyclothesclub.FristPage1.bean.TagBean;
import com.men.boyclothesclub.FristPage1.bean.ViewPagerBean;
import com.men.boyclothesclub.FristPage1.utils.FristConstont;
import com.men.boyclothesclub.Group3.utils.GroupRecyclerDecoration;
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

    private RecyclerView mRecycler;
    private FristRecyclerAdapter adapter;
    private List<FristBean.DataBean.ItemDetailBean> fristList;
    private LinearLayout ll;
    private ViewPager viewPager;
    private ViewPagerCommonAdapter viewPagerAdapter;
    private List<ImageView> list;
    private List<ViewPagerBean.DataBean> listBean;
    //时间
    private Timer timer;
    private int indexVp;
    private TimerTask timerTask;
    //顶部图标
    private int topRes[] = new int[]{R.id.id_iv_top1, R.id.id_iv_top2, R.id.id_iv_top3, R.id.id_iv_top4};
    private int topTVRes[] = new int[]{R.id.id_tv_top1, R.id.id_tv_top2, R.id.id_tv_top3, R.id.id_tv_top4};
    //品牌
    private List<ImageView> ivpps;
    private int ppRes[] = new int[]{R.id.id_iv_pp11, R.id.id_iv_pp12, R.id.id_iv_pp13, R.id.id_iv_pp14,
            R.id.id_iv_pp21, R.id.id_iv_pp22};
    //学堂
    private ImageView ivxt1, ivxt2;
    private TextView tvxt1, tvxt2, tvxtpl1, tvxtpl2, tvxtrd1, tvxtrd2;
    //搭配
    private TextView tvdp1, tvdpmore, tvdp_1, tvdp_2, tvdp_3, tvdp2, tvdp_21, tvdp_22, tvdp_23;
    private ImageView ivdpbig1, ivdp11, ivdp12, ivdp13, ivdpbig2, ivdp21, ivdp22, ivdp23;
    private TextView[] tvdps1, tvdps2;
    private ImageView[] ivdps1, ivdps2;
    //市场
    private ImageView ivsp1, ivsp2, ivsp3, ivsp4;
    private ImageView[] ivsps;
    //
    public Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {

                case FristConstont.HANDER_TAG_LIST:
                    FristBean frist = (FristBean) msg.obj;
                    fristList.addAll(frist.getData().getItemDetail());
                    adapter.notifyDataSetChanged();
                    break;
                case FristConstont.HANDER_TAG_AD_TIMER:
                    indexVp %= 3;
                    viewPager.setCurrentItem(indexVp);
                    indexVp++;
                    break;
                case FristConstont.HANDER_TAG_AD:
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
                case FristConstont.HANDER_TAG_TAG:
                    TagBean t = (TagBean) msg.obj;
                    for (int i = 0; i < 4; i++) {
                        try {
                            String urlImg = t.getData().get(i).getTheme_image();
                            ImageView iv = (ImageView) ll.findViewById(topRes[i]);
                            TextView tv = (TextView) ll.findViewById(topTVRes[i]);
                            OkHttpUtils.setImage(urlImg, iv);
                            tv.setText(t.getData().get(i).getTheme_name());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case FristConstont.HANDER_TAG_OTHER:
                    String url1 = msg.obj.toString();
                    OtherBean other = OtherBean.objectFromData(url1);
                    setSchoolView(other);
                    setBrandView(other);
                    setMatch(other);
                    break;
                case FristConstont.HANDER_TAG_SHOP:
                    String url2 = msg.obj.toString();
                    ShopBean shop = ShopBean.objectFromData(url2);
                    for (int i = 0; i < ivsps.length; i++) {
                        Picasso.with(getActivity()).load(shop.getData().get(i).getTheme_image())
                                .into(ivsps[i]);
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
        fristList = new ArrayList<>();
        mRecycler = (RecyclerView) getRootLayout().findViewById(R.id.id_lv_frist);
        ll = (LinearLayout) inflater.inflate(R.layout.custom1_frist_top, null);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecycler.setLayoutManager(layoutManager);
        GroupRecyclerDecoration decoration=new GroupRecyclerDecoration(5);
        mRecycler.addItemDecoration(decoration);
        adapter = new FristRecyclerAdapter(fristList, getActivity(),ll);
        mRecycler.setAdapter(adapter);

        setData();
//        lv.addHeaderView(ll);
        lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        setTagIconData();
        setViewPager();
        setTime();
        setOther();
        setShop();
    }


    /**
     * 定时器
     */
    private void setTime() {
        timerTask = new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(FristConstont.HANDER_TAG_AD_TIMER);
            }
        };
        timer = MainActivity.getTimer();
        timer.schedule(timerTask, 3000, 1500);
    }

    private void setOther() {

        initBrandView();
        initSchoolView();
        initMatch();
        OkHttpUtils.getRequest(FristConstont.URL_OTHER, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtil.e("其他请求出错");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                sendOKMessage(response, FristConstont.HANDER_TAG_OTHER);
            }
        });

    }

    private void initSchoolView() {
        ivxt1 = (ImageView) ll.findViewById(R.id.id_iv_xt);
        ivxt2 = (ImageView) ll.findViewById(R.id.id_iv_xt2);
        tvxt1 = (TextView) ll.findViewById(R.id.id_tv_xt);
        tvxt2 = (TextView) ll.findViewById(R.id.id_tv_xt2);
        tvxtpl1 = (TextView) ll.findViewById(R.id.id_tv_xt_pl);
        tvxtpl2 = (TextView) ll.findViewById(R.id.id_tv_xt_pl2);
        tvxtrd1 = (TextView) ll.findViewById(R.id.id_tv_xt_rd);
        tvxtrd2 = (TextView) ll.findViewById(R.id.id_tv_xt_rd2);
    }

    private void setSchoolView(OtherBean other) {
        for (int i = 0; i < ppRes.length; i++) {
            String ppurl = other.getData().getBrand().get(i).getBrandIcon();
            Picasso.with(getActivity()).load(ppurl).into(ivpps.get(i));
        }
        Picasso.with(getActivity()).load(other.getData().getSchool().get(0).getImage())
                .into(ivxt1);
        Picasso.with(getActivity()).load(other.getData().getSchool().get(1).getImage())
                .into(ivxt2);
    }

    private void initBrandView() {
        ivpps = new ArrayList<>();
        for (int i = 0; i < ppRes.length; i++) {
            ImageView iv = new ImageView(getActivity());
            iv = (ImageView) ll.findViewById(ppRes[i]);
            ivpps.add(iv);
        }
    }

    private void setBrandView(OtherBean other) {
        tvxt1.setText(other.getData().getSchool().get(0).getTitle());
        tvxt2.setText(other.getData().getSchool().get(1).getTitle());
        tvxtpl1.setText(other.getData().getSchool().get(0).getClickCount() + "");
        tvxtpl2.setText(other.getData().getSchool().get(1).getClickCount() + "");
    }

    private void initMatch() {
        ivdpbig1 = (ImageView) ll.findViewById(R.id.id_iv_dp_big);
        ivdpbig2 = (ImageView) ll.findViewById(R.id.id_iv_dp_big2);
        ivdp11 = (ImageView) ll.findViewById(R.id.id_iv_dp_1);
        ivdp12 = (ImageView) ll.findViewById(R.id.id_iv_dp_2);
        ivdp13 = (ImageView) ll.findViewById(R.id.id_iv_dp_3);
        ivdp21 = (ImageView) ll.findViewById(R.id.id_iv_dp_21);
        ivdp22 = (ImageView) ll.findViewById(R.id.id_iv_dp_22);
        ivdp23 = (ImageView) ll.findViewById(R.id.id_iv_dp_23);
        ivdps1 = new ImageView[]{ivdp11, ivdp12, ivdp13};
        ivdps2 = new ImageView[]{ivdp21, ivdp22, ivdp23};

        tvdpmore = (TextView) ll.findViewById(R.id.id_tv_dp_more);
        tvdp1 = (TextView) ll.findViewById(R.id.id_tv_dp1);
        tvdp_1 = (TextView) ll.findViewById(R.id.id_tv_dp_1);
        tvdp_2 = (TextView) ll.findViewById(R.id.id_tv_dp_2);
        tvdp_3 = (TextView) ll.findViewById(R.id.id_tv_dp_3);
        tvdp2 = (TextView) ll.findViewById(R.id.id_tv_dp2);
        tvdp_21 = (TextView) ll.findViewById(R.id.id_tv_dp_21);
        tvdp_22 = (TextView) ll.findViewById(R.id.id_tv_dp_22);
        tvdp_23 = (TextView) ll.findViewById(R.id.id_tv_dp_23);
        tvdps1 = new TextView[]{tvdp_1, tvdp_2, tvdp_3};
        tvdps2 = new TextView[]{tvdp_21, tvdp_22, tvdp_23};
    }

    private void setMatch(OtherBean other) {
        for (int i = 0; i < ivdps1.length; i++) {
            String tagName = other.getData().getMatch().get(0).getTags().get(i).getTagName();
            tvdps1[i].setText(tagName);
            String itemurl = other.getData().getMatch().get(0).getSingleItems().get(i).getPic_url();
            Picasso.with(getActivity()).load(itemurl).into(ivdps1[i]);
        }
        for (int i = 0; i < ivdps1.length; i++) {
            String tagName = other.getData().getMatch().get(1).getTags().get(i).getTagName();
            tvdps2[i].setText(tagName);
            String itemurl = other.getData().getMatch().get(1).getSingleItems().get(i).getPic_url();
            Picasso.with(getActivity()).load(itemurl).into(ivdps2[i]);
        }
        tvdp1.setText(other.getData().getMatch().get(0).getTheme_desc());
        tvdp2.setText(other.getData().getMatch().get(1).getTheme_desc());
        Picasso.with(getActivity()).load(other.getData().getMatch().get(0)
                .getBig_image()).into(ivdpbig1);
        Picasso.with(getActivity()).load(other.getData().getMatch().get(1)
                .getBig_image()).into(ivdpbig2);
    }

    private void setShop() {
        ivsp1 = (ImageView) ll.findViewById(R.id.id_iv_ts1);
        ivsp2 = (ImageView) ll.findViewById(R.id.id_iv_ts2);
        ivsp3 = (ImageView) ll.findViewById(R.id.id_iv_ts3);
        ivsp4 = (ImageView) ll.findViewById(R.id.id_iv_ts4);
        ivsps = new ImageView[]{ivsp1, ivsp2, ivsp3, ivsp4};
        OkHttpUtils.getRequest(FristConstont.URL_SHOP, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtil.e("特色市场请求出错");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                sendOKMessage(response, FristConstont.HANDER_TAG_SHOP);
            }
        });
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
                sendOKMessage(response, FristConstont.HANDER_TAG_AD);
            }
        });

    }

    public void setTagIconData() {
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
                message.what = FristConstont.HANDER_TAG_TAG;
                handler.sendMessage(message);
            }
        });
    }

    public void sendOKMessage(Response response, int what) throws IOException {
        ResponseBody body = response.body();
        String url = body.string();
        Message message = Message.obtain();
        message.what = what;
        message.obj = url;
        handler.sendMessage(message);
    }

    @Override
    protected void initEvent() {

    }

    public void setData() {
        OkHttpUtils.getRequest(FristConstont.URL_LIST, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtil.e("List错误");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody body = response.body();
                String listStr = body.string();
                FristBean frist = FristBean.objectFromData(listStr);
                Message message = Message.obtain();
                message.obj = frist;
                message.what = FristConstont.HANDER_TAG_LIST;
                handler.sendMessage(message);
            }
        });
    }
}
