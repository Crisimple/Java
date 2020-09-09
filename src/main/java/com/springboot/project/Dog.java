/**
 * @file Dog
 * @author sf
 * @date 2020/9/8 9:37 下午
 * @description
 */

package com.springboot.project;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component  // 注册 bean 到容器中
@ConfigurationProperties(prefix = "dog")
public class Dog {
//	@Value("test dog")
	private String name;
//	@Value("19")
	private Integer age;
	
	public Dog(){
		
	}

	public Dog(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Dog{" +
				       "name='" + name + '\'' +
				       ", age=" + age +
				       '}';
	}
}
