package com.men.boyclothesclub.FristPage1.ui;

import android.os.Handler;
import android.os.Message;
import android.widget.GridView;
import android.widget.ImageView;

import com.men.boyclothesclub.Base.adapter.CommonAdapter;
import com.men.boyclothesclub.Base.adapter.ViewHolder;
import com.men.boyclothesclub.Base.ui.BaseActivity;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.FristPage1.bean.ShopRCBean;
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
public class ShopRCActivity extends BaseActivity {
    private GridView gridView;
    private CommonAdapter<ShopRCBean.DataBean> adapter;
    private List<ShopRCBean.DataBean> list;
    public Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case FristConstont.HANDER_TAG_RC:
                    ShopRCBean bean = ShopRCBean.objectFromData(msg.obj.toString());
                    list.addAll(bean.getData());
                    adapter.notifyDataSetChanged();
                break;
            }
        }
    };
    @Override
    protected int setRootView() {
        return R.layout.activity_frist_shop_rc;
    }

    @Override
    protected void init() {
        list = new ArrayList<>();
        gridView = (GridView) findViewById(R.id.id_gv_rc);
        adapter = new CommonAdapter<ShopRCBean.DataBean>(R.layout.custom1_frist_shop_rc_item
                    ,list,ShopRCActivity.this) {
            @Override
            public void setContent(ViewHolder vh, ShopRCBean.DataBean item) {
                vh.setTextViewText(R.id.id_tv_shop_RC,item.getKind_name());
                ImageView iv = (ImageView) vh.getViews(R.id.id_iv_shop_rc);
                Picasso.with(ShopRCActivity.this).load(item.getKind_icon()).into(iv);
            }
        };
        gridView.setAdapter(adapter);
        OkHttpUtils.getRequest(FristConstont.URL_SHOP_RC, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody responseBody = response.body();
                String json = responseBody.string();
                Message message = Message.obtain();
                message.obj = json ;
                message.what = FristConstont.HANDER_TAG_RC;
                handler.sendMessage(message);
            }
        });
    }

    @Override
    protected void initEvent() {

    }
}
