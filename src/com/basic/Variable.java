package com.basic;

/**
 * @Description: 变量
 * @Author: QHB
 * @Date: 2022/10/8 15:36
 */

// 变量

public class Variable {

    // 成员变量
    int a = 3;
    // 静态变量
    static float b = (float) 1.24;

    public static void main(String[] args) {
        int b = 0;
        System.out.println("gg");
    }
}

/*
变量本质 = 停车位 -- 固定空间
变量名 = 车位编号 -- 变量名
数据 = 车 -- 变化的量

变量的分类和作用域:
1. 变量有三种类型: 局部变量 成员变量(实例变量) 静态变量(类变量)

局部变量 --  在方法或语句块内部声明, 从属于方法/语句块, 从声明位置开始, 直到方法或者语句块执行完毕, 局部变量消失
成员变量 --  在类的内部或者方法的外部声明, 从属于对象, 对象创建则成员变量跟着创建, 对象消失则成员变量跟着消失
静态变量 --  在类的内部声明或者static修饰, 从属于类, 类被加载, 静态变量就有效, 类被卸载, 静态变量就消失

2.


 */


