package com.lee.powerfuladapter.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/6/4.
 *
 * 通用的Adapter
 */
public abstract class CommAdapter<T> extends BaseAdapter {

    protected Context context;
    protected List<T> mDatas;
    protected LayoutInflater inflater;
    protected int resourceId;

    public CommAdapter(Context context, List<T> mDatas,int resourceId) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.mDatas = mDatas;
        this.resourceId = resourceId;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder = ViewHolder.get(context,parent,convertView, resourceId,position);

        convert(holder,getItem(position));

        return holder.getmConvertView();
    }

    public abstract void convert(ViewHolder holder,T t);
}
