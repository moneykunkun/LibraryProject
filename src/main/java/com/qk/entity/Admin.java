package com.qk.entity;

import java.io.Serializable;

public class Admin implements Serializable {

    private Integer id;     //id


    private String username;        //用户名


    private String password;        //用户密码


    private Integer adminType;      //管理员类型


    private static final long serialVersionUID = 1L;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


    public Integer getAdminType() {
        return adminType;
    }


    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }
}