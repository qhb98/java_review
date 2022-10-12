package com.ba;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Description: 捕获异常的处理机制
 * @Author: QHB
 * @Date: 2022/10/12 10:01
 */
public class ExceptionClass {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("F:\\java_repo\\java_start\\figures\\1.txt");
            char c = (char) reader.read();
            char c2 = (char) reader.read();
            char c3 = (char) reader.read();
            System.out.println(" " + c + c2 + c3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // 在命令行打印异常信息在程序中出错的位置及原因
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
try 语句指定了一段代码, 该段代码就是异常捕获并处理的范围, 在执行过程中, 当任意一条语句产生异常,
就会跳过该条语句中后面的代码, 代码中可能会产生并抛出一种或几种类型的异常对象, 后面的catch语句要
分别对这些异常做相应的处理

当异常处理的代码执行结束后, 不会回到try语句去执行尚未执行的代码


一个try语句会伴随一个或多个catch语句, 用于处理可能产生的不同类型的异常对象
catch捕获异常时的捕获顺序 --  如果异常类之间有继承关系, 先捕获子类异常再捕获父类异常

finally 不管是否发生了异常都必须要执行
通常在finally中关闭已经打开的资源, 如果关闭文件流 释放数据库连接等

 */