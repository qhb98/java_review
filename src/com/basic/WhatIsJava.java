package com.basic;

/**
 * java程序的运行机制
 * 1. java首先利用文本编辑器编写java源程序, 源文件的后缀名为.java
 * 2. 再利用编译器将源程序编译成字节码文件, 字节码文件的后缀名为.class
 * 3. 最后利用虚拟机JVM解释执行
 * java语言是编译型和解释型的结合
 * JDK > JRE > JVM  如果只是运行java程序, 就只需要JRE即可, 若要开发java程序, 就需要安装JDK
 * JDK: JRE 编译器  调试器
 * JRE： java runtime environment 包含java虚拟机、库函数等
 * JVM: 虚拟机
 * JDK的下载和安装: https://blog.csdn.net/Marvin_996_ICU/article/details/106240065
 * JDK环境变量的配置: https://www.bilibili.com/video/BV1za411C7ZD?p=6&spm_id_from=pageDriver&vd_source=7111d4cfa9354342c253c06ecdd64e2f
 * JDK --> Oracle JDK  /  open JDK(免费开源)
 */

public class WhatIsJava {
    public static void main(String[] args) {
        System.out.println("hello world.");
    }
}


