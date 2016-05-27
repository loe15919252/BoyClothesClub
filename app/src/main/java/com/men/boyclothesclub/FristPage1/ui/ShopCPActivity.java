package com.men.boyclothesclub.FristPage1.ui;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import android.widget.ListView;

import com.men.boyclothesclub.Base.adapter.CommonAdapter;
import com.men.boyclothesclub.Base.adapter.ViewHolder;
import com.men.boyclothesclub.Base.ui.BaseActivity;
import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.FristPage1.bean.ShopCPBean;
import com.men.boyclothesclub.FristPage1.utils.FristConstont;
import com.men.boyclothesclub.R;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;


/**
 * Created by Administrator on 2016/5/27.
 */
public class ShopCPActivity extends BaseActivity{
    private List<ShopCPBean.DataBean.ItemDetailBean> list;
    private ListView listView;
    private CommonAdapter<ShopCPBean.DataBean.ItemDetailBean> adapter;
    private String url ;
    public Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case FristConstont.HANDER_TAG_SHOP:
                    ShopCPBean bean = ShopCPBean.objectFromData(msg.obj.toString());
                    list.addAll(bean.getData().getItemDetail());
                    adapter.notifyDataSetChanged();
                break;
            }
        }
    };
    @Override
    protected int setRootView() {
        return R.layout.activity_frist_shop_cp;
    }

    @Override
    protected void init() {
        initView();
        initData();
    }

    private void initData() {
        OkHttpUtils.getRequest(FristConstont.URL_SHOP_CP, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody body = response.body();
                String json = body.string();
                Message msg = Message.obtain();
                msg.obj = json;
                msg.what = FristConstont.HANDER_TAG_SHOP;
                handler.sendMessage(msg);
            }
        });
    }

    private void initView() {
        list = new ArrayList<>();
        listView = (ListView) findViewById(R.id.id_lv_frist_shop_cp);
        adapter = new CommonAdapter<ShopCPBean.DataBean.ItemDetailBean>(
                R.layout.custom1_frist_shop_cp_item
                ,list,ShopCPActivity.this) {
            @Override
            public void setContent(ViewHolder vh, ShopCPBean.DataBean.ItemDetailBean item) {
                vh.setTextViewText(R.id.id_tv_shop_ivright,item.getSaveCount()+"");
                vh.setTextViewText(R.id.id_tv_shop_ivbottom_top,item.getDescription());
                vh.setTextViewText(R.id.id_tv_shop_ivbottom_bottom,item.getTitle());
                vh.setTextViewText(R.id.id_tv_shop_money, "¥" + item.getPrice());
                ImageView iv = (ImageView) vh.getViews(R.id.id_iv_shop);
                Picasso.with(ShopCPActivity.this).load(item.getPic_url()).into(iv);
            }
        };
        listView.setAdapter(adapter);
    }

    @Override
    protected void initEvent() {

    }
}
