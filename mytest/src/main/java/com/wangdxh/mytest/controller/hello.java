package com.wangdxh.mytest.controller;

import com.wangdxh.mytest.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class hello {
    @Value("${mydata}")
    public String name;

    @Autowired
    Person person;

    @RequestMapping("/{user}/aaa")
    public String hello(@PathVariable String user){
        if (user.equals("wang")){
            throw new RuntimeException("this is a good abc");
        }
        return "this is test web : " + user + name + person ;
    }
}
