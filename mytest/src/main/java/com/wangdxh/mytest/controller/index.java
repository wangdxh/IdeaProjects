package com.wangdxh.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {

    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
