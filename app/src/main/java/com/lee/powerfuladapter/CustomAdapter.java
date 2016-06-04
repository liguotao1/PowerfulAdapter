package com.lee.powerfuladapter;

import android.content.Context;

import com.lee.powerfuladapter.bean.Bean;
import com.lee.powerfuladapter.util.CommAdapter;
import com.lee.powerfuladapter.util.ViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2016/6/4.
 */
public class CustomAdapter extends CommAdapter<Bean> {

    public CustomAdapter(Context context, List<Bean> mDatas, int resourceId) {
        super(context, mDatas, resourceId);
    }

    @Override
    public void convert(ViewHolder holder, Bean bean) {
        holder.setText(R.id.tv_title_item,bean.getTitle())
                .setText(R.id.tv_desc_item,bean.getDesc())
                .setText(R.id.tv_time_item,bean.getTime())
                .setText(R.id.tv_phone_item,bean.getPhone());
    }
}
