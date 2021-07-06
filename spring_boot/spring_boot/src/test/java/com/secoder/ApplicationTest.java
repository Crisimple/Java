package com.secoder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
public class ApplicationTest {

    // SpringData测试，DI注入数据源
    @Autowired
    private DataSource dataSource;

    @Test
    public void connect_database() throws SQLException {
        // 看一下默认数据源
        System.out.println(dataSource.getClass());
        // 获得连接
        Connection connection =   dataSource.getConnection();
        System.out.println(connection);
        // 关闭连接
        connection.close();
    }
}
