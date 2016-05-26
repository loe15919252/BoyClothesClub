package com.men.boyclothesclub.Single2.ui.common;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Administrator on 2016/5/25.
 */
public class GroupRecyclerDecoration extends RecyclerView.ItemDecoration  {
    // TODO: 2016/5/25  Recycler装饰类
    private int space;

    public GroupRecyclerDecoration(int space) {
        this.space = space;
    }


    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left=space;
        outRect.right=space;
        outRect.bottom=space;
        if(!(parent.getChildAdapterPosition(view)<2)){
            outRect.top=space;
        }
    }
}
