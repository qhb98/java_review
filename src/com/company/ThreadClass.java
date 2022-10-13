package com.company;

/**
 * @Description: 线程
 * @Author: QHB
 * @Date: 2022/10/13 15:03
 */
public class ThreadClass {
    public static void main(String[] args) {
        // 获取当前的线程对象
        Thread thread = Thread.currentThread();

        // 获取当前线程对象的名称
        String currentThreadName = thread.getName();
        System.out.println(currentThreadName);

        // 为当前线程重新设置名称
        thread.setName("myThread");
        currentThreadName = thread.getName();
        System.out.println(currentThreadName);
    }
}


/*

进程 --  应用程序的执行实例, 每个进程都有独立的内存空间和系统资源
线程 --  CPU调度和分派的基本单元, 执行运算的最小单位, 可以完成一个独立的顺序控制流程

多线程 -- 如果在一个进程中同时运行了多个线程, 用来完成不同的工作, 则称为多线程
         多个线程交替占用CPU资源, 并非真正地并行执行
         好处是 充分利用CPU的资源, 提升代码的性能, 简化编程模型等


线程调度 是指 按照特定机制为多个线程分配CPU的使用权

线程优先级 1- 10, 1最低, 默认是5
优先级高的线程抢到的概率更大, 但不能保证一定能抢到

多线程共享数据会带来数据不安全的问题, 原因是多线程共同操作数据时, 引发的冲突  --  线程同步



 */