package com.wangdxh.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// --spring.profiles.active=prod
// 指定配置文件： spring.config.location=/abc/application.properties
// --server.port=8083
// server.servlet.context-path=/admin
// org.springframework.boot.autoconfigure.EnableAutoConfiguration 在spring.factories 文件内

// 怎么知道哪些自动配置类生效了？
// debug=true 得到自动配置类报告


@SpringBootApplication
public class MytestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MytestApplication.class, args);
    }
}
