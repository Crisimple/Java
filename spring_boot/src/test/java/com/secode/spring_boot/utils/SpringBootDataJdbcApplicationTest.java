package com.secode.spring_boot.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author secoder
 * @File SpringBootDataJdbcApplicationTest
 * @Time 2021-07-11 23:59
 * @Description
 */
@SpringBootTest
public class SpringBootDataJdbcApplicationTest {

    @Autowired  // DI注入数据源
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {

        // 查看下默认数据源
        System.out.printf("dataSource.getClass(): ", dataSource.getClass());

        // 获得连接
        Connection connection = dataSource.getConnection();
        System.out.printf("connection: ", connection);

        // 关闭连接
        connection.close();
    }
}
