package com.crisimple.base;
import java.util.Scanner;

public class ProcessChoose {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("if单选泽请输入");
        String s = scanner.nextLine();
        System.out.println("if双选择请输入");
        int score = scanner.nextInt();

        // if 单选择结构
        if (s.equals("Hello")){
            System.out.println(s);
        }
        System.out.println("End");

        // if 双选择结构
        if (score >= 60){
            System.out.println("成绩及格了");
        } else{
            System.out.println("成绩不及格");
        }
        System.out.println("End");
        scanner.close();
    }
}
