package com.men.boyclothesclub.FristPage1;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.Base.utils.OkHttpUtils;
import com.men.boyclothesclub.FristPage1.utils.FristConstont;
import com.men.boyclothesclub.R;

import java.io.IOException;

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
    }

    @Override
    protected void initEvent() {

    }

    public void setData() {
        OkHttpUtils.getRequest(FristConstont.Tag, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtil.e("连接错误");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody body = response.body();
                LogUtil.e("连接成功，数据：" + body.string());
//                TagBean b = TagBean.objectFromData(body.string());
            }
        });
    }
}
