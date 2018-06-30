package com.wangdxh.elai.controller;

import com.wangdxh.elai.bean.MyResponse;
import com.wangdxh.elai.bean.User;
import com.wangdxh.elai.utils.myjwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class Login {

    @GetMapping("/login")
    public MyResponse login(@RequestParam("username") String username, @RequestParam("password") String password) {
        User usr = new User();
        usr.setName(username);
        usr.setRole("vip");
        String str = myjwt.sign(usr, 3600);
        return MyResponse.ok().putDataValue("token", str);
    }

    @GetMapping("/qrcode/{uuid}")
    String createQRCode(@PathVariable String uuid, HttpServletResponse response) {
        return null;
    }

}