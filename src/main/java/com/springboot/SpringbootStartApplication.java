package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 标注这个类是一个 SpringBoot 的应用
@SpringBootApplication
public class SpringbootStartApplication {

	public static void main(String[] args) {
		// 将 SpringBoot 应用程序启动
		SpringApplication.run(SpringbootStartApplication.class, args);
	}

}
