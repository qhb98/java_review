package com.basic;

/**
 * @Description: 基本数据类型 primitive data type
 * @Author: QHB
 * @Date: 2022/10/9 15:31
 */
public class DataType {

    public static void main() {

        int a = 100;
        int b = 015;
        int c = 0xff;
        int d = 0b1001010101;

        byte e = 50;
        short f = 10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int salary = 30000; // 整型常量默认类型是int
        long yearSalary = 300000000L; // 将整型常量定义为long类型
        System.out.println(yearSalary);

        int money = 1000000000;
        int years = 20;

        int total = money * years;
        System.out.println(total);

        long total1 = money * years;
        System.out.println(total1);

        long total2 = money * ((long)years);
        System.out.println(total2);

        long total3 = 1L * money * years;
        System.out.println(total3);

    }

}
/*
基本数据类型: 数值型(整数类型 byte, short, int, long; 浮点型 float, double)、字符型(char)、布尔型(boolean)
引用数据类型: 类class、接口interface、数组array

整型变量和整型常量 --
    byte  占用 1 bit  表数范围 -2^7 ~ 2^7-1
    short 占用 2 bit  表数范围 -2^15 ~ 2^15-1
    int 占用 4 bit
    long 占用 8 bit

    十进制整数, 如 99 -500
    八进制整数, 要求以0开头, 如 015
    十六进制整数, 要求以0x或0X开头, 如 0x15
    二进制数, 要求0b或0B开头, 如 0b01110011

浮点型 floating point number --
    float 占用4个字节  表数范围 -3.403E38 ~ 3.403E38 单精度类型, 尾数可以精确到7位有效数字
    double 占用8个字节  表数范围 -1.79803E308 ~ 1.79803E308 双精度类型

    浮点型不精确, 不要用于比较, 浮点数适合普通的科学和工程计算, 精度足够, 但是不适合精度要求非常高的商业计算,
    这时候需要使用BigDecimal进行计算

字符型
    字符集ASCII(英文, 数字, 特殊字符, 控制符)

布尔型 boolean --
    在内存中占用1个或4个字节

运算符 operator
    执行数学运算, 算术运算符, 赋值运算符, 扩展运算符, 关系运算符, 逻辑运算符, 位运算符, 条件运算符, 字符串连接符


数据类型的转换 --
    自动类型转换是指容量小的数据类型可以自动转换为容量大的数据类型
    强制类型转换cast, 用于强制转换数值的类型, 可能会损失精度

    基本数据类型转换时候出现的溢出问题:
        1. 操作比较大的数时, 要留意是否溢出, 尤其是整数操作时;
        2. long类型 L尽量大写, 而不是小写l;





 */