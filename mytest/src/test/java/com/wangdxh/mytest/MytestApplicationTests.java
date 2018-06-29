package com.wangdxh.mytest;

import com.wangdxh.mytest.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MytestApplicationTests {

    @Autowired
    Person person;
    @Test
    public void contextLoads() {
        Logger log = LoggerFactory.getLogger(getClass());
        log.trace("this is trace");
        log.debug("this is debug");
        log.info("this is info");
        log.warn(person.toString());
        log.error("this is error");
    }

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){

    }

}
