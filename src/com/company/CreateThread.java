package com.company;

/**
 * @Description: 创建线程
 * @Author: QHB
 * @Date: 2022/10/13 16:07
 */
public class CreateThread{
    public static void main(String[] args) {
        // 创建线程对象并启动
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();

        // 线程调度, 优先级
        myThread.setPriority(10);
        myThread2.setPriority(1);

        // 启动线程
        myThread.start();
        myThread2.start();

    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        for (int i=0; i <= 100; i ++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

/*
// *************　创建线程的流程
    // 继承thread类

    // 重写run()方法

    // 调用start()方法启动线程

 */