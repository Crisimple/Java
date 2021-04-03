/**
 * @file HelloSpringBoot
 * @author sf
 * @date 2020/9/6 5:45 下午
 * @description
 */

package com.springboot.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloJava {
	
	// 请求地址：http://127.0.0.1:8080/hello/hello
	@GetMapping("/hello")
	@ResponseBody
	public String hello(){
		return "Hello Java";
	}
	
}
