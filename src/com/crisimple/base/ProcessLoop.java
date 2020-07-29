package com.crisimple.base;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class ProcessLoop {

    public static void main(String[] args){
        /*
        * while循环
        * */
        int num = 0;
        int num1 = 0;
        int sum = 0;
        while (num1 <= 10){
            sum += num;
            num1++;
        }
        System.out.println("sum = " + sum);
        System.out.println("===== 华丽的分割线1 =====");
        while (num<0){
            System.out.println("num: " + num);
        }
        System.out.println("===== 华丽的分割线2 =====");

        /*
        * do...while 循环
        * */
        do{
            num ++;
            System.out.println("num: " + num);
        } while (num < 0);


        /*
        * for 循环
        * 快捷生成：100.for
        * */
        System.out.println("===== for 循环分割线 =====");
        for(int i=1; i<=100; i++){
            System.out.println(i);
        }
        System.out.println("===== for 循环结束 =====");


        /*
        * 用于数组的增强型 for 循环
        * JDK5 引入的
        * */
        int[] nums = {10, 20, 30, 40, 50};
        for(int x:nums){
            System.out.println("x: " + x);
        }
    }

}
