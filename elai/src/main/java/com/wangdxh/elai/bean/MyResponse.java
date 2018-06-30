package com.wangdxh.elai.bean;

import java.util.HashMap;
import java.util.Map;

public class MyResponse {
    private String message;
    private final int code;
    private final Map<String, Object> data = new HashMap<String, Object>();

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public MyResponse putDataValue(String key, Object value) {
        data.put(key, value);
        return this;
    }

    private MyResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static MyResponse ok() {
        return new MyResponse(200, "Ok");
    }

    public static MyResponse notFound() {
        return new MyResponse(404, "Not Found");
    }

    public static MyResponse badRequest() {
        return new MyResponse(400, "Bad Request");
    }

    public static MyResponse forbidden() {
        return new MyResponse(403, "Forbidden");
    }

    public static MyResponse unauthorized() {
        return new MyResponse(401, "unauthorized");
    }

    public static MyResponse serverInternalError() {
        return new MyResponse(500, "Server Internal Error");
    }

    public static MyResponse customerError() {
        return new MyResponse(1001, "customer Error");
    }
}