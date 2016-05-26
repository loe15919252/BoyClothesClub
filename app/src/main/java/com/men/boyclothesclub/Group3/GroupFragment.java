package com.men.boyclothesclub.Group3;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.Group3.Adapter.RecyclerViewAdapter;
import com.men.boyclothesclub.Group3.bin.Group_Header_bin;
import com.men.boyclothesclub.Group3.bin.Group_bin;
import com.men.boyclothesclub.Group3.utils.GroupRecyclerDecoration;
import com.men.boyclothesclub.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
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
    private LayoutInflater mInflate;

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
        this.mInflate=inflater;

        mList=new ArrayList<>();
        // TODO: 2016/5/24 初始化控件
        mRecycler= (RecyclerView) rootView.findViewById(R.id.id_Group_Recycler);
        StaggeredGridLayoutManager LayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecycler.setLayoutManager(LayoutManager);
        // TODO: 2016/5/25  给Item添加边距
        GroupRecyclerDecoration decoration=new GroupRecyclerDecoration(5);
        mRecycler.addItemDecoration(decoration);
        initData(getUrlString(page));
        // TODO: 2016/5/26 加载头部Fragment
        View headrView = getHeadrView(inflater);

        // TODO: 2016/5/24 设置适配器
        adapter = new RecyclerViewAdapter(mList, getActivity(),headrView);
        mRecycler.setAdapter(adapter);
    }

    private void initData(String url) {
        // TODO: 2016/5/24 初始化数据源
        OkHttpUtils.getRequest(url,new Callback() {
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
        // TODO: 2016/5/26 设置监听
        mRecycler.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (newState==RecyclerView.SCROLL_STATE_SETTLING||newState==RecyclerView.SCROLL_STATE_IDLE) {

                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

            }
        });

    }

    /**
     * 头部属性
     */

    private static final String url="http://api.nanyibang.com/match-classify?system_name=android&versionCode=189";
    private static final int UPDATE_HEADER_UI=150;
    private TextView manner;
    private TextView theme;
    private LinearLayout layout_1,layout_2,layout_3;
    private List<Group_Header_bin.DataBean> hList;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int what = msg.what;
            LogUtil.i("handleMessage"+what);
            switch (what){
                case UPDATE_HEADER_UI:setHeadrData();
                    break;
            }
        }
    };

    public View getHeadrView(LayoutInflater inflater) {
        View headrView = inflater.inflate(R.layout.custom3_group_header, null);
        initHeade(headrView);
        OkHttpUtils.getRequest(url,new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Group_Header_bin header_bin = Group_Header_bin.objectFromData(string);
                hList.addAll(header_bin.getData());
                Message message = new Message();
                message.what=UPDATE_HEADER_UI;
                handler.handleMessage(message);
            }
        });

        return headrView;
    }

    private void setHeadrData() {
        manner.setText(hList.get(0).getName());
//        theme.setText(hList.get(1).getName());
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1);
        for (int j = 0; j <hList.size() ; j++) {
            for (int i = 0; i <hList.get(j).getItems().size(); i++) {
                View inflate = mInflate.inflate(R.layout.custom3_group_header_item, null);
                inflate.setLayoutParams(lp);
                TextView tv = (TextView) inflate.findViewById(R.id.id_Group_header_item_tv);
                SimpleDraweeView iv= (SimpleDraweeView) inflate.findViewById(R.id.id_Group_header_item_iv);
                String classify_name = hList.get(j).getItems().get(i).getClassify_name();
                tv.setText(classify_name);
                iv.setImageURI(Uri.parse(hList.get(j).getItems().get(i).getClassify_icon()));
                if (j==0) {
                    if (i >= 4) {
                        layout_2.addView(inflate);
                    } else {
                        layout_1.addView(inflate);
                    }
                }else {
                    layout_3.addView(inflate);
                }
            }
        }
    }


    private void initHeade(View headrView) {
        hList=new ArrayList<>();
        manner= (TextView) headrView.findViewById(R.id.id_Group_Manner_tv);
        theme= (TextView) headrView.findViewById(R.id.id_Group_Theme_tv);
        layout_1= (LinearLayout) headrView.findViewById(R.id.id_Group_Manner_lin1);
        layout_2= (LinearLayout) headrView.findViewById(R.id.id_Group_Manner_lin2);
        layout_3= (LinearLayout) headrView.findViewById(R.id.id_Group_Theme_lin);
    }

}
