package com.enums;

/**
 * Description:
 * Created by lixiong on 2017/10/15.
 */
public enum Sex {

    MALE(1,"男"),
    FEMALE(2,"女");

    private int key;

    private String desc;

    Sex(int key, String desc){
        this.key = key;
        this.desc = desc;
    }

    public int getKey() {
        return key;
    }

    public String getDesc() {
        return desc;
    }
}
