package com.wangdxh.mytest.bean;

import java.sql.Timestamp;

public class Table {
    private  String id;
    private  String title;
    private  String status;
    private  String author;
    private Timestamp display_time;
    private Integer pageviews;

    public Table() {
        title = "aaa";
        status = "xxx";
        author = "wang";
        pageviews = 122;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Timestamp getDisplay_time() {
        return display_time;
    }

    public void setDisplay_time(Timestamp display_time) {
        this.display_time = display_time;
    }

    public Integer getPageviews() {
        return pageviews;
    }

    public void setPageviews(Integer pageviews) {
        this.pageviews = pageviews;
    }
}
