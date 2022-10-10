package com.basic;

/**
 * @Description: 递归
 * @Author: QHB
 * @Date: 2022/10/10 13:24
 */

public class Recursion {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int res = factorial(55);
        long endTime = System.currentTimeMillis();
        System.out.println(res);
        long timeSpend = endTime - startTime;
        System.out.println(timeSpend);
    }

    // 阶乘
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}


/*

递归是一种常见的算法思路, 基本思想就是自己调用自己, 在很多算法中都有使用
递归调用会占用大量的内存和堆栈


 */