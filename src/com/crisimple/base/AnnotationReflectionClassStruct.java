/**
 * @file AnnotationReflectionClassStruct
 * @author sf
 * @date 2020/9/1 3:42 下午
 * @description 获取运行时类的完整结构
 */

package com.crisimple.base;

import java.awt.event.MouseWheelEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationReflectionClassStruct {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
		// main 方法
		
		Class c1 = Class.forName("com.crisimple.base.ClassRunStruct");
		
		// 获得包名+类名
		System.out.println("获得包名+类名：" + c1.getName());
		// 获得类名
		System.out.println("获得类名：" + c1.getSimpleName());
		
		// 获得类的属性
		System.out.println("\n->=->=->=->=->=->=->=->=->=->=->=->=->=->=->");
		// 只能找到 public 属性
		Field[] fields = c1.getFields();
		// 找到全部的属性
		fields = c1.getDeclaredFields();
		for (Field field: fields){
			System.out.println("获得类的属性: " + field);
		}
		// 获取指定属性的值
		Field name = c1.getDeclaredField("name");
		System.out.println("获取指定属性的值：" + name);
		
		
		// 获得类的方法
		System.out.println("\n->=->=->=->=->=->=->=->=->=->=->=->=->=->=->");
		// 获得本类及其父类的全部 public 方法
		Method[] methods = c1.getMethods();
		for(Method method: methods){
			System.out.println("获得本类及其父类的全部 public 方法：" + method);
		}
		// 获得本类的所有方法
		methods = c1.getDeclaredMethods();
		for (Method method: methods){
			System.out.println("获得本类的所有方法：" + method);
		}
		// 获得指定方法
		// 重载
		Method getName = c1.getMethod("getName", null);
		Method setName = c1.getMethod("setName", String.class);
		System.out.println("获得指定方法" + getName);
		System.out.println("获得指定方法" + setName);
		
		
		// 获得指定的构造器
		System.out.println("\n->=->=->=->=->=->=->=->=->=->=->=->=->=->=->");
		Constructor[] constructors = c1.getConstructors();
		for (Constructor constructor: constructors){
			System.out.println("获得指定的构造器：" + constructor);
		}
		// 
		constructors = c1.getDeclaredConstructors();
		for (Constructor constructor: constructors){
			System.out.println("#获得指定的构造器：" + constructor);
		}
		// 获得指定的构造器
		Constructor declaredConstructors = c1.getDeclaredConstructor(String.class, int.class, int.class);
		System.out.println("获得指定的构造器：" + declaredConstructors);
	}
}

/**
 * 实体类：只有属性和构造方法
 */
class ClassRunStruct{
	private String name;
	private int id;
	private int age;
	public int height;
	
	public ClassRunStruct(){}
	
	public ClassRunStruct(String name, int id, int age){
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ClassRunStruct{" +
				       "name='" + name + '\'' +
				       ", id=" + id +
				       ", age=" + age +
				       '}';
	}
}