package com.entity;

/**
 * Description:
 * Created by lixiong on 2017/10/13.
 */
public class User {
    private int id;

    private int userId;

    private String passportNum;

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
