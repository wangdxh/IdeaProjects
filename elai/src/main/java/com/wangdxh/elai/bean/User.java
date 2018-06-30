package com.wangdxh.elai.bean;

public class User {
    private String name;
    private String Passwd;
    private String Role;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Passwd='" + Passwd + '\'' +
                ", Role='" + Role + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return Passwd;
    }

    public void setPasswd(String passwd) {
        Passwd = passwd;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
