package com.men.boyclothesclub.FristPage1.ui;

import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.widget.GridView;
import android.widget.ImageView;

import com.men.boyclothesclub.Base.adapter.CommonAdapter;
import com.men.boyclothesclub.Base.adapter.ViewHolder;
import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.FristPage1.bean.BrandBean;
import com.men.boyclothesclub.FristPage1.utils.FristConstont;
import com.men.boyclothesclub.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/26.
 */
public class BrandRORFragment extends BaseFragment {

    private GridView gridView;
    private CommonAdapter<BrandBean.DataBean> adapter;
    private List<BrandBean.DataBean> list;
    public Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case FristConstont.HANDER_TAG_BRAND:
                    String json = msg.obj.toString();
                    BrandBean brandBean = BrandBean.objectFromData(json);
                    List<BrandBean.DataBean> lists = brandBean.getData();
                    list.addAll(lists);
                    adapter.notifyDataSetChanged();
                    break;
            }
        }
    };

    public BrandRORFragment(List<BrandBean.DataBean> list) {
        this.list = list;
    }

    @Override
    protected String setTitle() {
        return "";
    }

    @Override
    protected int setRootLayout() {
        return R.layout.fragment_frist_brand;
    }

    @Override
    protected void init(LayoutInflater inflater) {
        list = new ArrayList<>();
        gridView = (GridView) getRootLayout().findViewById(R.id.id_gv_com);

        adapter = new CommonAdapter<BrandBean.DataBean>(R.layout.custom1_frist_brand_item,list,getActivity()) {
            @Override
            public void setContent(ViewHolder vh, BrandBean.DataBean item) {
                vh.setTextViewText(R.id.id_tv_brand, item.getTitle());
                ImageView iv = (ImageView) vh.getViews(R.id.id_iv_brand);
                Picasso.with(getActivity()).load(item.getPic_url()).into(iv);
            }
        };
        gridView.setAdapter(adapter);
    }

    @Override
    protected void initEvent() {

    }
}
