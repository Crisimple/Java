package com.springboot.java_base;

public class Operator {
public static void main(String[] args) {
	/*
	 * 算术运算符 +，-，*，/，%，++，--
	 * 赋值运算符 =
	 * 扩展赋值运算符 +=, -=, *=, /=
	 * */
	int a1 = 10;
	int b1 = 20;
	System.out.print(a1 + b1 + "\n");
	System.out.print(a1 - b1 + "\n");
	System.out.print(a1 * b1 + "\n");
	System.out.print((double) a1 / b1 + "\n");
	// 取余运算
	System.out.print(a1 % b1 + "\n");
	// 自增
	System.out.print("=====自增=====\n");
	// a1 = a1 + 1，执行完代码后，先给 b 赋值，a1再自增
	int c11 = a1++;
	System.out.print(a1 + "\n");
	// 执行代码前，a1再自增，先给 b 赋值
	int c12 = ++a1;
	System.out.print(a1 + "\n");
	System.out.print(c11 + "\n");
	System.out.print(c12 + "\n");
	// 自减
	// 扩展赋值运算符
	int a = 10;
	int b = 20;
	a += b;
	b -= a;
	System.out.println("a: " + a);
	System.out.println("b: " + b);
	System.out.print("算术运算符 赋值运算符 扩展赋值运算符 \n\n");
	
	
	/*
	 * 关系运算符：>, <, >=, <=, ==, !=, instanceof
	 * */
	int a21 = 109;
	int a22 = 10;
	byte a13 = '1';
	double a14 = 112.2;
	System.out.print((a21 > a22) + "\n");
	System.out.print((a21 >= a22) + "\n");
	System.out.print((a21 < a22) + "\n");
	System.out.print((a21 < a22) + "\n");
	System.out.print((a21 == a22) + "\n");
	System.out.print((a21 != a22) + "\n");
	System.out.print((a21 != a22) + "\n");
	System.out.print("关系运算符 \n\n");
	
	
	/*
	 * 逻辑运算符：&&, ||, !
	 * */
	boolean a31 = true;
	boolean a32 = false;
	System.out.println("a31&&a32: " + (a31 && a32));
	System.out.println("a31||a32: " + (a31 || a32));
	System.out.println("!(a31 && a32): " + !(a31 && a32));
	System.out.print("逻辑运算符 \n");
	/*
	 * 位运算符：&, |, ^, ~, >>, <<, >>>
	 * a41 = 0011 1100
	 * a42 = 0000 1101
	 *
	 * a41&a42 = 0000 1100
	 * a41|a42 = 0011 1101
	 * a41^a42 = 0011 0001
	 * ~a42 = 1111 0010
	 *
	 * 面试题：2*8 怎样计算最快，左移右移位移效率最高
	 * << *2
	 * >> /2
	 * */
	System.out.println((2 << 3) + "\n");
	
	
	/*
	 * 条件运算符：x？y : z    如果 x 的值为真，则结果为 y；否则结果为 z
	 * */
	int score = 99;
	String type = (score > 60) ? "及格" : "不及格";
	System.out.println(type);
}
}
