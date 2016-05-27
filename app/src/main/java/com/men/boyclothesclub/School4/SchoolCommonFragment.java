package com.men.boyclothesclub.School4;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.men.boyclothesclub.Base.adapter.CommonAdapter;
import com.men.boyclothesclub.Base.adapter.ViewHolder;
import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.MainActivity;
import com.men.boyclothesclub.R;
import com.men.boyclothesclub.School4.bean.SchoolDataBean;
import com.men.boyclothesclub.School4.utils.SchoolConstont;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import okhttp3.Call;
import okhttp3.ResponseBody;

/**
 * Created by Administrator on 2016/5/26.
 */
public class SchoolCommonFragment extends BaseFragment implements AbsListView.OnScrollListener{

    // fragment 列表
    private ListView mListview;

    // 单品 布局参数
    private ViewGroup.LayoutParams lp;

    // 请求地址
    private String request_url;

    // 地址编码
    private String indexCode = "1";

    // 是否 在底部
    private boolean isBottom = false;

    // 是否在加载
    private boolean isLoading = false;

    // 学堂 列表 适配器
    private CommonAdapter<SchoolDataBean.DataBean> mDataAdapter;

    // 学堂 数据集合
    private List<SchoolDataBean.DataBean> mDataList;

    // 头部 文件
    private View mHeadview;
    private View mHeadviewPage;

    //图片资源
    private List<ImageView> mImgList;
    private int i = 0;
    private Timer timer;
    private TimerTask timerTask;

    private String index;
    private String url ;


    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case SchoolConstont.SCHOOL_DATA_MSG1:
                    break;
            }
        }
    };


    public SchoolCommonFragment(String index) {
        this.index = index;
        url = SchoolConstont.SCHOOL_URL_DATA+"&page=1&kind="+index;
        LogUtil.e(url);
    }
    @Override
    protected String setTitle() {
        return null;
    }

    @Override
    protected int setRootLayout() {
        return R.layout.fragment_school_viewpager;
    }

    @Override
    protected void init(LayoutInflater inflater) {
        // 列表
        mListview = (ListView) rootView.findViewById(R.id.id_fragment_school_listview);
        // 加载 listview 中 ITEM 的布局
        mHeadview = inflater.inflate(R.layout.custom4_school_item, null);

        mDataList = new ArrayList<>();
        mDataAdapter = new CommonAdapter<SchoolDataBean.DataBean>(
                R.layout.custom4_school_item,mDataList,getActivity())
        {
            @Override
            public void setContent(ViewHolder vh, final SchoolDataBean.DataBean item) {
                LinearLayout layout1= (LinearLayout) vh.getViews(R.id.id_four_item_title);
                LinearLayout layout2 = (LinearLayout) vh.getViews(R.id.id_four_item_info);
                // 先不显示
                layout1.setVisibility(View.GONE);
                layout2.setVisibility(View.GONE);

                /**
                 *   -- 这一块 需要重写  --
                 */
                if (SchoolConstont.SCHOOL_URL_DATA.equals(item.getInfo().toString())) {
                    layout1.setVisibility(View.VISIBLE);
                    vh.setTextViewText(R.id.id_four_item_title, item.getInfo());

                    ImageView iv = (ImageView) vh.getViews(R.id.id_four_item_iv);
                    iv.setImageResource(R.mipmap.ic_launcher);
                    String url = item.getImage();
                    iv.setTag(url);

                }


            }
        };



    }








    @Override
    protected void initEvent() {

    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

    }





}
