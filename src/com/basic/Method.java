package com.basic;

/**
 * @Description: 方法概念
 * @Author: QHB
 * @Date: 2022/10/9 16:59
 */
public class Method {
    public static void main(String[] args) {
        int res = add(1, 2, 4);
        System.out.println(res);

    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}

/*
 输入 --> 方法 --> 输出

方法 method: 一段用来完成特定功能的代码片段, 类似于其他语言的函数function
方法用于定义该类或该类的实例的行为特征和功能实现
面向过程中, 函数是最基本单位, 整个程序由一个个函数调用组成. 面向对象中, 整个程序的基本单位是类, 方法是从属于类和对象的

方法声明格式:
    [修饰符1 修饰符2 ... ] 返回值类型  方法名(形式参数列表){
        语句块
    }

方法的调用方式:
    普通方法 --  对象名.方法名(实参列表)
    静态方法 --  类名.方法名(实参列表)

语句块(复合语句):
    语句块中定义的变量只能用于自己, 外部不能使用. 语句可以使用外部的变量, 但外部的变量不能使用语句块的变量.


方法的重写override:




 */

