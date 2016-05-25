package com.men.boyclothesclub.Group3;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Group3.Adapter.RecyclerViewAdapter;
import com.men.boyclothesclub.Group3.bin.Group_bin;
import com.men.boyclothesclub.Group3.utils.GroupRecyclerDecoration;
import com.men.boyclothesclub.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/5/23.
 */
public class GroupFragment extends BaseFragment {


    private RecyclerView mRecycler;
    private List<Group_bin.DataBean> mList;
    int page=1;
    private Group_bin groupBin;
    private RecyclerViewAdapter adapter;
    private int oy=0,y=0;

    private String getUrlString(int page){
        return new String("http://api.nanyibang.com/match-list?page="+page+"&system_name=android&versionCode=189");
    }

    @Override
    protected String setTitle() {
        return "搭配";
    }

    @Override
    protected int setRootLayout() {
        return R.layout.fragment_group;
    }

    @Override
    protected void init(LayoutInflater inflater) {
        mList=new ArrayList<>();
        // TODO: 2016/5/24 初始化控件
        mRecycler= (RecyclerView) rootView.findViewById(R.id.id_Group_Recycler);
        StaggeredGridLayoutManager LayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecycler.setLayoutManager(LayoutManager);
        // TODO: 2016/5/25  给Item添加边距
        GroupRecyclerDecoration decoration=new GroupRecyclerDecoration(5);
        mRecycler.addItemDecoration(decoration);
        initData(getUrlString(page));
        View inflate = inflater.inflate(R.layout.custom3_group_header, null);
        TextView tv1 = (TextView) inflate.findViewById(R.id.id_Recycler_test_tv);
        tv1.setText("这里是头部文件");
        // TODO: 2016/5/24 设置适配器
        adapter = new RecyclerViewAdapter(mList, getActivity(),inflate);
        mRecycler.setAdapter(adapter);
    }

    private void initData(String url) {
        // TODO: 2016/5/24 初始化数据源
        OkHttpClient httpClient=new OkHttpClient();
        Request request=new Request.Builder()
                .url(url)
                .build();
        Call call=httpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                groupBin = Group_bin.objectFromData(string);
                mList.addAll(groupBin.getData());
            }
        });
    }




    @Override
    protected void initEvent() {
//        RecyclerView.OnScrollListener
        mRecycler.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (newState==RecyclerView.SCROLL_STATE_SETTLING||newState==RecyclerView.SCROLL_STATE_IDLE) {
                    if (oy==y&&oy!=0)
                    {
                        page++;
                        initData(getUrlString(page));
                        LogUtil.i("加载分页成功"+page);
                        adapter.notifyDataSetChanged();
                    }else
                    {
                        oy=y;
                    }
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                y+=dy;
            }
        });

    }
}
