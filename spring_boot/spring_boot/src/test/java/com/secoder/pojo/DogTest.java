package com.secoder.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author sf
 * @File Dog
 * @Time 2021-04-23 15:12
 * @Description
 */
@SpringBootTest
public class DogTest {

	// 将狗狗自动注入进来
	@Autowired
	private Dog dog;
	
	@Test
	public void test_dogInfo(){
		System.out.println(dog);
	}
}
