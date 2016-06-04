package com.lee.powerfuladapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.lee.powerfuladapter.bean.Bean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvBean;
    private List<Bean> mDatas;
    private CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDatas();
        initView();
    }

    private void initDatas() {
        mDatas = new ArrayList<>();
        for(int i=1;i<30;i++){
            Bean bean = new Bean("标题"+i,"描述"+i,"2016-6-"+i,"10086");
            mDatas.add(bean);
        }
        adapter = new CustomAdapter(this,mDatas,R.layout.item_list);
    }

    private void initView() {
        lvBean = (ListView) findViewById(R.id.lv_bean);
        lvBean.setAdapter(adapter);
    }
}
