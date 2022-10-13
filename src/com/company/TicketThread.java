package com.company;

/**
 * @Description: 使用模拟用户购票模拟多线程共享数据
 * @Author: QHB
 * @Date: 2022/10/13 16:18
 */
public class TicketThread implements Runnable{
    private int ticket = 10;
    private int num = 0;

    /**
     * 用户抢票
     */
    @Override
    public void run(){
        while (true){
            // 没有余票, 跳出循环
            if (ticket <= 0){
                break;
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
}

class TestThread{
    public static void main(String[] args) {
        Runnable runnable = new TicketThread();
        Thread t1 = new Thread(runnable, "hk");
        Thread t2 = new Thread(runnable, "fs");
        Thread t3 = new Thread(runnable, "fad");

        System.out.println("开始抢票");

        t1.start();
        t2.start();
        t3.start();

    }
}
