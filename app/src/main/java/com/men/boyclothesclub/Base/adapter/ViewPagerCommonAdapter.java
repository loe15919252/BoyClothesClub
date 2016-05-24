package com.men.boyclothesclub.Base.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * created dpb on 16/5/5.
 * <p/>
 * e_mail  dengpbs@163.com.
 * ViewPager的适配器
 */
public class ViewPagerCommonAdapter extends PagerAdapter {

    private List<ImageView> list;
    private Context context;
//    private List<LiZhiBean.DataBean.ListBean> headList;

    public ViewPagerCommonAdapter(List<ImageView> list,
                                  Context context
//                                  List<LiZhiBean.DataBean.ListBean> headList
    ) {
        this.list = list;
        this.context = context;
//        this.headList = headList;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View view = list.get(position);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(context, WebActivity.class);
//                intent.putExtra(Contants.TAG_WEB_URL, headList.get(position).getData().getHref());
//                context.startActivity(intent);
            }
        });
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(list.get(position));
    }
}
