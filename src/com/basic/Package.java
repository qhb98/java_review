package com.basic;

import static java.lang.Math.*;

/**
 * @Description: 包机制
 * @Author: QHB
 * @Date: 2022/10/10 21:20
 */

public class Package {
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(sqrt(2));
        System.out.println(random());

    }
}

/*

包package, 相当于文件夹对于文件的作用, 用于管理类和解决类的重名问题.

package的使用有两个要点:
    1. 通常是类的第一句非注释性语句
    2. 包名一般是域名倒着写即可, 便于内部管理类

com.gao  和 com.gao.car 两个包没有包含关系, 是两个完全独立的包, 只是逻辑上看起来后者是前者的一部分.

导入类 import

静态导入 作用是用于导入指定类的静态属性和静态方法



 */