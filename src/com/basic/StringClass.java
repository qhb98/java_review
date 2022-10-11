package com.basic;

/**
 * @Description: string类
 * @Author: QHB
 * @Date: 2022/10/11 21:15
 */
public class StringClass {
    public static void main(String[] args) {
        String g1 = "111";
        String g2 = "111";
        String g3 = new String("111");

        System.out.println(g1 == g2);
        System.out.println(g1 == g3);

        System.out.println(g1.equals(g2));
        System.out.println(g1.equals(g3));
    }
}

/*

字符串类
    string类又称为 不可变字符序列
    位于java.lang包
    java字符串就是unicode字符序列
    java没有内置的字符串类型, 而是在标准java类库中提供了一个预定义的类string, 每个用
    双引号括起来的字符串都是string类的一个实例


String类和常量池
    常量池分为三种 -- 全局字符串常量池, class文件常量池, 运行时常量池(runtime constant pool)





 */