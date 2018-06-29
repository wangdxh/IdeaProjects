package com.wangdxh.mytest.controller;

import com.wangdxh.mytest.bean.RespEntity;
import com.wangdxh.mytest.bean.Table;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/vue-admin/table")
public class TableController {

    @RequestMapping(value="/list", method=RequestMethod.GET)
    private RespEntity list(){
        List<Table> tablist = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            Table tab = new Table();
            tab.setId(Integer.toString(i));
            tab.setDisplay_time( new Timestamp(System.currentTimeMillis()));
            ((LinkedList<Table>) tablist).push(tab);
        }
        Map<String, Object> map = new HashMap<>();

        map.put("items", tablist);
        return new RespEntity(20000, map);
    }
}
