package com.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController     // @RestController Comments 告诉 Spring 将结果字符串直接渲染回调用方。
@EnableAutoConfiguration    // 告诉 Spring Boot 根据所添加的 jar 依赖关系“猜测”您将如何配置 Spring
public class HelloController {
	
	@RequestMapping(value = "/helloController", method = RequestMethod.GET)     // @RequestMapping注解提供“路由”信息。它告诉 Spring，任何带有路径“ /”的 HTTP 请求都应 Map 到hello方法
	public String hello(){
		return "Hello Controller.";
	}
}
