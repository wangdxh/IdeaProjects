package com.wangdxh.elai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping(value = "/hello")
    public String hello(){
        return "hello guzhielai";
    }
}
