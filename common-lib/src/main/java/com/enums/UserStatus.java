package com.enums;

/**
 * Description:
 * Created by lixiong on 2017/10/15.
 */
public enum UserStatus {
    SUCCESS(1,"成功"),
    FAILED(2,"失败"),
    OVER(3,"已结束");

    private int key;

    private String desc;

    UserStatus(int key, String desc){
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
