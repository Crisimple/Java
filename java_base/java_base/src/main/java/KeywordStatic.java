/**
 * @file OopStatic
 * @author sf
 * @date 2020/8/20 8:48 下午
 * @description Java 关键词 static
 */

/**
 * 静态导入包
 */

import static java.lang.Math.PI;

public class KeywordStatic {

public static void main(String[] args) {
	// main 方法
	/**
	 * 静态方法，类是直接可以调用的，因为他们是随类一起加载的
	 */
	StaticClass.staticMethod();
	System.out.println(StaticClass.name);
	
	/**
	 * 非静态的
	 */
	StaticClass staticClass = new StaticClass();
	staticClass.noStaticMethod();
	System.out.println(staticClass.age);
	
	/**
	 * 看下静态代码块、匿名代码块和构造器的执行顺序
	 */
	StaticClass staticClass2 = new StaticClass();
	
	/**
	 * 静态导入包，第一个为非静态导入包之前的调用，第二个为静态导入包后的调用
	 */
//        System.out.println(Math.PI);
	System.out.println(PI);
}
	
}

class StaticClass {
/**
 * 静态属性，随类一起加载
 */
public static String name;
/**
 * 非静态属性
 */
public int age;

/*
匿名代码块
 */ {
	System.out.println("这是匿名代码块");
}

/*
静态代码块，最早执行，且只执行一次
 */
static {
	System.out.println("这是静态代码块");
}

/*
构造方法
 */
public StaticClass() {
	System.out.println("这是无参构造器");
}

/**
 * 静态方法，随类一起加载
 */
public static void staticMethod() {
	System.out.println("static method");
}

/**
 * 非静态方法，需要实例化对象，对象来调用
 */
public void noStaticMethod() {
	/**
	 * 因为静态方法跟随类一起加载，所以在非静态方法中可以直接调用，反之则不能
	 */
	staticMethod();
	System.out.println("no static method");
}
	
}

