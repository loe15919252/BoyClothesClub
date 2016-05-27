package com.men.boyclothesclub.FristPage1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.men.boyclothesclub.Base.utils.LogUtil;
import com.men.boyclothesclub.FristPage1.bean.FristBean;
import com.men.boyclothesclub.R;
import com.squareup.picasso.Picasso;
import com.wangjie.shadowviewhelper.ShadowProperty;
import com.wangjie.shadowviewhelper.ShadowViewHelper;

import java.util.List;


/**
 * 瀑布流适配器
 * Created by Administrator on 2016/5/24.
 */
public class FristRecyclerAdapter extends RecyclerView.Adapter<FristRecyclerAdapter.MasonryView>{

    public static final int TYPE_HEADER = 0;
    public static final int TYPE_NORMAL = 1;

    private List<FristBean.DataBean.ItemDetailBean> list;
    private Context context;
    private ShadowProperty shadowProperty;
    private View Header;

    public void setHeaderView(View headerView) {
        Header = headerView;
        notifyItemInserted(0);
    }

    @Override
    public int getItemViewType(int position) {
        if(Header == null) return TYPE_NORMAL;
        if(position == 0) return TYPE_HEADER;
        return TYPE_NORMAL;
    }


    public int getRealPosition(RecyclerView.ViewHolder holder) {
        int position = holder.getLayoutPosition();
        return Header == null ? position : position - 1;
    }

    @Override
    public void onViewAttachedToWindow(MasonryView holder) {
        super.onViewAttachedToWindow(holder);
        ViewGroup.LayoutParams lp = holder.itemView.getLayoutParams();
        if(lp != null
                && lp instanceof StaggeredGridLayoutManager.LayoutParams) {
            StaggeredGridLayoutManager.LayoutParams p = (StaggeredGridLayoutManager.LayoutParams) lp;
            p.setFullSpan(holder.getLayoutPosition() == 0);
        }
    }

    // TODO: 2016/5/24 构造方法 传递数据源和上下文
    public FristRecyclerAdapter(List<FristBean.DataBean.ItemDetailBean> list, Context context, View Header) {
        this.Header=Header;
        this.list = list;
        this.context = context;
        // TODO: 2016/5/25 阴影样式
        shadowProperty = new ShadowProperty()
                .setShadowColor(0x77000000)
                .setShadowDy(0)
                .setShadowRadius(4);
    }

    @Override
    public MasonryView onCreateViewHolder(ViewGroup parent, int viewType) {
        if(Header!=null&& viewType == TYPE_HEADER) return new MasonryView(Header);
        // TODO: 2016/5/24 获取布局文件 
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom1_frist_item, parent, false);
        // TODO: 2016/5/25 对布局设置阴影
        ShadowViewHelper.bindShadowHelper(shadowProperty,view.findViewById(R.id.id_Group_Layout));
        return new MasonryView(view);
    }

    @Override
    public void onBindViewHolder(MasonryView holder, int position) {
        if(getItemViewType(position) == TYPE_HEADER) return;

        final int pos = getRealPosition(holder);
        // TODO: 2016/5/24 设置布局内容
        holder.textView.setText(list.get(pos).getTitle());
        holder.imageView.setImageResource(R.mipmap.ic_launcher);
        Picasso.with(context)
                .load(list.get(pos).getPic_url())
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
            imageView= (ImageView) itemView.findViewById(R.id.id_frist_item_iv);
            textView= (TextView) itemView.findViewById(R.id.id_frist_item_tv);
        }

    }

}
