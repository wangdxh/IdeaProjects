package com.wangdxh.myjdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyjdbcApplicationTests {

    @Autowired
    DataSource datasource;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println(datasource.getClass());
        Connection connect = datasource.getConnection();
        System.out.println(connect);
        connect.close();
    }

}
