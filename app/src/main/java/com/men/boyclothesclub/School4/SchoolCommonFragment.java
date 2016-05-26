package com.men.boyclothesclub.School4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

import com.men.boyclothesclub.Base.adapter.CommonAdapter;
import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.R;

import java.util.List;

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
    private CommonAdapter mDataAdapter;

    // 学堂 数据集合
    private List mDataList;

    // 头部 文件
    private View mHeadview;

    public SchoolCommonFragment(String request_url) {
        this.request_url = request_url;
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
        mListview = (ListView) rootView.findViewById(R.id.id_fragment_school_listview);
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
