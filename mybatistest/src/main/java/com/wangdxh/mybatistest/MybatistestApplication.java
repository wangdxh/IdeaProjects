package com.wangdxh.mybatistest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wangdxh.mybatistest.mapper")
@SpringBootApplication
public class MybatistestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatistestApplication.class, args);
    }
}
