package com.wangdxh.mybatistest.controller;

import com.wangdxh.mybatistest.bean.Jsfw;
import com.wangdxh.mybatistest.mapper.JsfwMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jsfw")
public class JsfwController {

    @Autowired
    JsfwMapper mapper;


    @GetMapping("/{id}")
    public Jsfw getJsfwbyid(@PathVariable("id") Integer id){
        return mapper.getJsfwBy(id);
    }

    @GetMapping("/")
    public Jsfw addJsfw(Jsfw data){
        mapper.insertJsfw(data);
        return data;
    }

    @DeleteMapping("/{id}")
    public int deleteJsfwbyid(@PathVariable("id") Integer id){
        return mapper.deleteJsfwByid(id);
    }
}
