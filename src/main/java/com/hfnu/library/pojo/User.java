package com.hfnu.library.pojo;

import lombok.Data;

/**
 * @author wendy_wan
 * @date 2020/2/17 10:05
 */
@Data
//对应读者表
public class User {
    private int userId;
    private String userName;
    private String passWd;
    private String rname;
    private String phone;
    private String email;

    public User() {
    }
    public User(String userName, String passWd) {
        this.userName = userName;
        this.passWd = passWd;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
