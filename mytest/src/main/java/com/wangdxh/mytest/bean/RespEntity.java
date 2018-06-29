package com.wangdxh.mytest.bean;

public class RespEntity {
    private int code;
    private Object data;

    public RespEntity(int respCode) {
        this.code = respCode;
    }

    public RespEntity(int respCode, Object data) {
        this(respCode);
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
