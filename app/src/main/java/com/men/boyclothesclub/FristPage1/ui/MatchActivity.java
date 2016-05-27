package com.men.boyclothesclub.FristPage1.ui;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.men.boyclothesclub.Base.adapter.CommonAdapter;
import com.men.boyclothesclub.Base.adapter.ViewHolder;
import com.men.boyclothesclub.Base.ui.BaseActivity;
import com.men.boyclothesclub.Base.utils.Constont;
import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.FristPage1.bean.MatchBean;
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

public class MatchActivity extends BaseActivity {

    private ListView lv;
    private List<MatchBean.DataBean> list;
    private CommonAdapter<MatchBean.DataBean> adapter;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case FristConstont.HANDER_TAG_MATCH:
                    MatchBean matchBean = MatchBean.objectFromData(msg.obj.toString());
                    List<MatchBean.DataBean> dataBeans = matchBean.getData();
                    list.addAll(dataBeans);
                    adapter.notifyDataSetChanged();
                    break;
            }
        }
    };

    @Override
    protected int setRootView() {
        return R.layout.activity_frist_match;
    }

    @Override
    protected void init() {
        lv = (ListView) findViewById(R.id.id_lv_frist_match);
        setAdapter();
        setData();
    }

    private void setAdapter() {
        list = new ArrayList<>();
        adapter = new CommonAdapter<MatchBean.DataBean>(R.layout.custom1_frist_match_item,list,MatchActivity.this) {
            @Override
            public void setContent(ViewHolder vh, MatchBean.DataBean item) {
                vh.setTextViewText(R.id.id_tv_match_ivright, item.getSaveCount() + "");
                vh.setTextViewText(R.id.id_tv_match_ivbottom, item.getInfo());
                ImageView iv = (ImageView) vh.getViews(R.id.id_iv_match);
                ImageView iv1 = (ImageView) vh.getViews(R.id.id_iv_match_1);
                ImageView iv2 = (ImageView) vh.getViews(R.id.id_iv_match_2);
                ImageView iv3 = (ImageView) vh.getViews(R.id.id_iv_match_3);
                Picasso.with(MatchActivity.this).load(item.getBig_image()).into(iv);

                Picasso.with(MatchActivity.this).load(item.getSingleItems().get(0).getPic_url()).into(iv1);
                Picasso.with(MatchActivity.this).load(item.getSingleItems().get(1).getPic_url()).into(iv2);
                Picasso.with(MatchActivity.this).load(item.getSingleItems().get(2).getPic_url()).into(iv3);

                vh.setTextViewText(R.id.id_tv_match_1, "¥" + item.getSingleItems().get(0).getCoupon_price());
                vh.setTextViewText(R.id.id_tv_match_2, "¥" + item.getSingleItems().get(1).getCoupon_price());
                vh.setTextViewText(R.id.id_tv_match_3, "¥"+item.getSingleItems().get(2).getCoupon_price());
            }
        };
        lv.setAdapter(adapter);
    }

    private void setData() {
        String tag = getIntent().getExtras().getString(Constont.TAG_MACTH_URL);
        String url = FristConstont.URL_OTHER_MATCH + tag;
        OkHttpUtils.getRequest(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody body = response.body();
                String url = body.string();
                Message message = Message.obtain();
                message.what = FristConstont.HANDER_TAG_MATCH;
                message.obj = url;
                handler.sendMessage(message);
            }
        });
    }

    @Override
    protected void initEvent() {

    }
}
