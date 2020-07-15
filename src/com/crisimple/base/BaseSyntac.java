package com.crisimple.base;

public class BaseSyntac {
    // 类变量
    static int a64 = 10;
    // 示例变量，从属于对象的，对象.a65
    int a65 = 65;

    public static void main(String[] args){
        /*
         * 八大数据类型
         * */
        // 整数
        int num1 = 10;
        byte num2 = 20;
        short num3 = 30;
        long num4 = 30L;
        // 浮点数
        float num21 = 0.1f;
        double num22 = 1.0/10;
        System.out.print(num21 == num22);
        float n21 = 1232434355f;
        float n22 = n21 + 1;
        System.out.print(n21==n22);
        double num23 = 3.14159265357589;
        // 字符
        char num31 = '可';
        char n31 = 'a';
        System.out.print((int)num31);
        System.out.print(n31);
        System.out.print((int)n31);
        // 布尔值
        boolean flag = true;
        boolean num42 = false;


        /*
        * 强制类型转换
        * 不能对 布尔值 进行转换
        * 不能把对象转换为不相干的类型
        * 在把高容量转换到低容量时，强制转换
        * 在转换时可能存在内存溢出，或者精度的问题
        * */
        System.out.print("\n==========强制类型转换============\n");
        System.out.print((int)23.6+"\n");
        System.out.print((int)-45.6+"\n");
        // 强制转换
        char c = 'a';
        int d = c + 1;
        System.out.print(d+"\n");
        System.out.print((char)d+"\n");
        // 内存溢出
        int money = 10_0000_0000;
        int year = 20;
        int salary_1 = money * year;
        System.out.print(salary_1+"\n");
        long salary_2 = money * (long)year;
        System.out.print(salary_2+"\n");


        /*
         * 变量与常量
         */
        // 局部变量
        int a61 = 0;
        String a62 = "crisimple";
        char a63 = '7';
        // 获取实例变量
        BaseSyntac var1 = new BaseSyntac();
        System.out.print("实例变量可以通过对象直接使用：" + var1.a65 + "\n");
        // 默认值，声明变量时不给变量赋予默认值
        byte a661 = 0;
        short a662 = 0;
        int a663 = 0;
        float a664 = 0;
        double a665 = 0;
        char a666 = 0;
        boolean a667 = false;
        System.out.print(a661);
        System.out.print(a662);
        System.out.print(a663);
        System.out.print(a664);
        System.out.print(a665);
        System.out.print(a666);
        System.out.print(a667);


        /*
        * 运算符
        * */

    }
}
