package com.basic;

/**
 * @Description: 方法重载
 * @Author: QHB
 * @Date: 2022/10/10 13:05
 */
public class OverLoad {
    public static void main(String[] args) {
        add(1, 2);
        add(1, 3.2);
    }

    static void add(int a, int b){

    }

    static void add(int a){

    }

    static void add(double b){

    }

    static void add(int a, double b){

    }

}
/*
 * 方法的重载: 一个类中可以定义多个名称相同, 但形式参数列表不同的方法
 *
 * 构成方法重载的条件: 1. 形参列表中 形参的类型, 形参的个数, 形参的顺序等不同;
 * 2.只有返回值不同不构成方法的重载. int a(String str){} 与 void a(String str){} 不构成方法的重载
 * 3. 只有形参的名称不同, 不构成方法的重载.  int a(String str){} 与 int a(String s){} 不构成方法的重载

 *
 * 构造方法的重载:
 *
 *
 *
 */