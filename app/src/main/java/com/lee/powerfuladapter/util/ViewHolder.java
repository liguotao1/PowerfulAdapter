package com.lee.powerfuladapter.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/6/4.
 * 通用的ViewHolder
 */
public class ViewHolder {

    private SparseArray<View> mViews;
    private int mPosition;
    private View mConvertView;

    public ViewHolder(Context context, ViewGroup parent,int resourceId,int position) {

        this.mPosition = position;
        this.mViews = new SparseArray<>();
        mConvertView = LayoutInflater.from(context).inflate(resourceId,parent,false);

        mConvertView.setTag(this);

    }
    //获取ViewHolder
    public static ViewHolder get(Context context,ViewGroup parent,
                                 View convertView,int resourceId,int position){
        //判断convertView是否为空(有可能为空,因而不需要通过参数传入)
        if(convertView == null){
            return new ViewHolder(context,parent,resourceId,position);
        }else{
            ViewHolder holder = (ViewHolder) convertView.getTag();
            //更新position
            holder.mPosition = position;
            return holder;
        }
    }

    public View getmConvertView() {
        return mConvertView;
    }

    //获取控件
    public <T extends View> T getView(int viewId){

        //从SparseArray内部获取
        View view = mViews.get(viewId);
        //判断是否存储过
        if(view == null){
            view = mConvertView.findViewById(viewId);
            //添加到SparseArray中
            mViews.put(viewId,view);
        }
        return (T) view;
    }
    //添加设置text的方法
    public ViewHolder setText(int viewId,String text){
        TextView textView = getView(viewId);
        textView.setText(text);
        return this;
    }
    //添加设置image的方法
    public ViewHolder setIamgeResource(int viewId,int resourceId){
        ImageView imageView = getView(viewId);
        imageView.setImageResource(resourceId);
        return this;
    }

    public ViewHolder setIamgeBitmap(int viewId, Bitmap bmp){
        ImageView imageView = getView(viewId);
        imageView.setImageBitmap(bmp);
        return this;
    }


    public int getmPosition() {
        return mPosition;
    }
}
