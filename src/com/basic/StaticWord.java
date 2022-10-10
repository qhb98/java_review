package com.basic;

/**
 * @Description: static关键字
 * @Author: QHB
 * @Date: 2022/10/10 17:11
 */
public class StaticWord {

}

/*

static本质:

静态变量/静态方法的生命周期和类相同, 在整个程序执行期间都有效.

构造方法用于对象的普通属性的初始化, 静态初始化块用于类的初始化操作, 初始化类的静态属性
在静态初始化块中不能直接访问非static成员

静态初始化块执行顺序:
上溯到object类, 先执行Object的静态初始化块, 再向下执行子类的静态初始化块, 直到
类的静态初始化块为止.
构造方法执行顺序和上面顺序一样.


 */