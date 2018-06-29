package com.wangdxh.mytest.bean;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {
    public UserInfo() {
        roles = new ArrayList<>();
        roles.add("admin");
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    private List<String> roles;
    private String name;
    private String avatar;

}
