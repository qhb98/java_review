package com.basic;

/**
 * @Description: 封装
 * @Author: QHB
 * @Date: 2022/10/11 16:02
 */
public class Encapsulation {
    private int testPrivate;
    int testDefault;
    protected int testProtected;
    public int testPublic;

    public void test(){
        System.out.println(this.testDefault);
        System.out.println(this.testProtected);
        System.out.println(this.testPrivate);
        System.out.println(this.testPublic);
    }

}
/*
封装 encapsulation -- 面向对象的三大特征之一, 理念是 高内聚, 低耦合

高内聚 -- 类的内部数据操作细节自己完成, 不允许外部干涉
低耦合 -- 仅暴露少量的方法给外部使用, 尽量方便外部调用

优点: 1. 提高代码的安全性, 2. 提高代码的复用性, 3. 提高可维护性, 4. 便于扩展和协作

==========================================================================================

实现 -- 使用访问控制符
                 访问权限
private          同一个类
default          同一个类/同一个包
protected        同一个类/同一个包/子类
public           同一个类/同一个包/子类/所有类


开发中封装的简单规则:
+ 属性一般使用private访问权限, 属性私有后, 提供相应的get/set方法来访问相关属性, 这些
方法通常是public修饰的, 以提供对属性的赋值和读取操作

+ 一般只用于本类的辅助性方法可以用private修饰, 希望其他类调用的方法用public修饰

==========================================================================================





 */