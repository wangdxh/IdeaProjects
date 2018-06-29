package com.wangdxh.mytest.controller;


import com.wangdxh.mytest.bean.RespEntity;
import com.wangdxh.mytest.bean.User;
import com.wangdxh.mytest.bean.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/vue-admin/user")
public class UserController {
    Logger log = LoggerFactory.getLogger(getClass());

    //@RequestMapping(value="/login", method=RequestMethod.POST)
    @PostMapping(value = "/login")
    public RespEntity login(@RequestBody User usrbody){
        log.info(usrbody.toString());
        Map<String, String > data = new HashMap<>();
        data.put("token", usrbody.getUsername());
        return new RespEntity(20000, data);
    }

    //@RequestMapping(value="/info", method=RequestMethod.GET)
    @GetMapping(value = "/info")
    public RespEntity info(@RequestParam(value = "token", required = true) String token){
        UserInfo usrinfo = new UserInfo();
        usrinfo.setName("admin");
        usrinfo.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        log.info(token);
        return new RespEntity(20000, usrinfo);
    }

    //@RequestMapping(value="/logout", method = RequestMethod.POST)
    @PostMapping(value = "/logout")
    public RespEntity logout(){
        return new RespEntity(20000);
    }

    // /user/{id} get
    // /users get
    // /user post
    // /user put
    // /user/{id} delete
}
