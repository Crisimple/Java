package com.springboot;

import com.springboot.project.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootStartApplicationTests {
	
	@Autowired  // 将测试类自动注入进来
//	private Dog dog;
	private Person person;
	
	@Test
	void contextLoads() {
		// 查看下狗狗对象的值是否被传参成功
		System.out.println(person);
	}

}
