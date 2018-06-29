package com.wangdxh.mybatistest.controller;

import com.wangdxh.mybatistest.bean.Viid;
import com.wangdxh.mybatistest.mapper.ViidMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/viid")
@RestController
public class ViidController {
    @Autowired
    ViidMapper mapper;

    @GetMapping(value = "/{id}")
    public Viid getViidbyId(@PathVariable("id") Integer id){
        return mapper.getViidById(id);
    }

}
