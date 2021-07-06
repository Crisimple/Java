package com.secoder.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author crisimple
 * @File PersonTest
 * @Time 2021-04-21 00:32
 * @Description
 */
@SpringBootTest
public class PersonTest {

    @Autowired
    private Person person;

    @Test
    public void test_printPersonInfo(){
        System.out.println(person);
    }
}
