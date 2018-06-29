package com.wangdxh.myjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class query {
    @Autowired
    JdbcTemplate template;

    @GetMapping(value = "/query")
    public List<Map<String, Object>> query(){
        List<Map<String, Object>> list = template.queryForList("select * from edstesttable");
        return list;//list.get(0);
    }
}
