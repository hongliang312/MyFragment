package com.lightheart.sphr.myrecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by 知足 on 2018/4/28.
 */

public class jiugeAdapter extends RecyclerView.Adapter<jiugeAdapter.MyViewHolder>{

    private List<RecycleViewjiugongge.DataBean> list;
    private Context context;

    public jiugeAdapter(List<RecycleViewjiugongge.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.jiugege_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

          ImageLoader.getInstance().displayImage(list.get(position).getIcon(),holder.icon,ImageLoaderUtils.getImageOptions());
           holder.name.setText(list.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return list !=null ?list.size():0;
    }


    class MyViewHolder extends RecyclerView.ViewHolder{

        private final ImageView icon;
        private final TextView name;

        public MyViewHolder(View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.jiugegeImg);
            name = itemView.findViewById(R.id.jiugegeName);
        }
    }
}