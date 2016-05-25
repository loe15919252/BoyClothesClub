package com.men.boyclothesclub.Group3.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.men.boyclothesclub.Group3.bin.Group_bin;
import com.men.boyclothesclub.R;
import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * 瀑布流适配器
 * Created by Administrator on 2016/5/24.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MasonryView>{

    private List<Group_bin.DataBean> list;
    private Context context;

    // TODO: 2016/5/24 构造方法 传递数据源和上下文 
    public RecyclerViewAdapter(List<Group_bin.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MasonryView onCreateViewHolder(ViewGroup parent, int viewType) {
        // TODO: 2016/5/24 获取布局文件 
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom3_recycler_item, parent, false);
        return new MasonryView(view);
    }

    @Override
    public void onBindViewHolder(MasonryView holder, int position) {
        // TODO: 2016/5/24 设置布局内容 
        holder.textView.setText(list.get(position).getInfo());
        Picasso.with(context)
                .load(list.get(position).getBig_image())
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        // TODO: 2016/5/24 获取数据条数 
        return list.size();
    }


    public static class MasonryView extends  RecyclerView.ViewHolder{
        // TODO: 2016/5/24 ViewHolder
        ImageView imageView;
        TextView textView;

        public MasonryView(View itemView){
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.id_Recycler_item_iv);
            textView= (TextView) itemView.findViewById(R.id.id_Recycler_item_tv);
        }

    }

}
