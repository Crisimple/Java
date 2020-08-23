/**
 * @file ThreadRealization
 * @author sf
 * @date 2020/8/23 10:34 上午
 * @description 线程实现（重点）
 */

package com.crisimple.base;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ThreadRealization extends Thread {

    @Override
    public void run(){
        // run 方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("子线程：我在写代码----" + i);
        }
    }

    public static void main(String[] args) {
        // main 方法
        // main 线程，主线程
        // 创建线程对象
        ThreadRealization threadRealization = new ThreadRealization();
        // 主线程调用 start() 方法，同时开启子线程
        threadRealization.start();

        // 调用子线程方法
        threadRealization.run();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程：我在学习多线程----" + i);
        }
    }
}

class TempClass{

}