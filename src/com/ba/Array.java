package com.ba;

/**
 * @Description: 数组
 * @Author: QHB
 * @Date: 2022/10/11 21:57
 */
public class Array {
    public static void main(String[] args) {
        int[] s = null;
        // 声明数组
        s = new int[10];
        // 给数组分配空间

        for (int i = 0; i < 10; i++) {
            s[i] = 2 * i + 1;
            // 给数组元素赋值
            System.out.println(s[i]);
        }
        // 动态初始化

        int[][] s1 = new int[12][3];
        System.out.println(s1[0][2]);
    }
}

class Start {
    int[] a = {1, 2, 3};
    // 静态初始化方式

    int a2[] = new int[2];
    // 默认0
    boolean[] b = new boolean[2];
    // 默认 false
    String[] s = new String[2];
    // 默认null
    // 默认初始化


}
/*
数组是相同类型数据的有序集合, 其中每一个数据称为一个元素, 每个元素可以通过一个索引(下标)来访问它们.

数组的四个基本特点:
    1. 长度确定 一旦被创建, 则大小不可以改变
    2. 元素的类型必须是相同类型, 不允许出现混合类型
    3. 数组类型可以是任何数据类型, 包括基本类型和引用类型
    4. 数组变量属于引用类型, 数组也是对象, 数组中的元素相当于对象的属性


数组的声明(以一维数组为例) --
    type[]  arr_name;
    type  arr_name[];

    声明的时候并没有实例化任何对象, 只有在实例化数组对象时, JVM才分配空间, 这时才与长度有关
    声明一个数组的时候并没有数组真正被创建
    构造一个数组必须指定长度


数组的初始化方式
1. 静态初始化

2. 动态初始化

3. 默认初始化

数组的操作方式 --  遍历 拷贝


 */