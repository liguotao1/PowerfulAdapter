package com.lee.powerfuladapter.bean;

/**
 * Created by Administrator on 2016/6/4.
 */
public class Bean {
    private String title;
    private String desc;
    private String time;
    private String phone;
    private boolean checkState;

    public Bean() {
    }

    public Bean(String title, String desc, String time, String phone) {
        this.title = title;
        this.desc = desc;
        this.time = time;
        this.phone = phone;
    }

    public boolean isCheckState() {
        return checkState;
    }

    public void setCheckState(boolean checkState) {
        this.checkState = checkState;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
