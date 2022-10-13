package com.company;

/**
 * @Description: 使用线程同步的方法解决多线程数据不安全问题
 * @Author: QHB
 * @Date: 2022/10/13 16:18
 */
public class TicketThread1 implements Runnable{
    private int ticket = 10;
    private int num = 0;
    private boolean flag = false;

    /**
     * 用户抢票
     */
    @Override
    public void run(){
        while(!flag){
            sale();
        }
    }

    public synchronized void sale(){
        // 没有余票, 跳出循环
        if (ticket <= 0){
            flag = true;
            return;
        }

        // 抢票, 修改车票数
        ticket--;
        num++;

        // 模拟网络延迟
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 显示出票反馈给用户
        System.out.println(Thread.currentThread().getName() +
                "抢到了第" + num + "张票, 剩余" + ticket + "张票.");
    }
}

class TestThread1{
    public static void main(String[] args) {
        Runnable runnable = new TicketThread1();
        Thread t1 = new Thread(runnable, "hk");
        Thread t2 = new Thread(runnable, "fs");
        Thread t3 = new Thread(runnable, "fad");

        System.out.println("开始抢票");

        t1.start();
        t2.start();
        t3.start();

    }
}
