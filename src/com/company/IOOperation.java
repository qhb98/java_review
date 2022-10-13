package com.company;

import java.io.*;

/**
 * @Description: IO操作
 * @Author: QHB
 * @Date: 2022/10/13 13:24
 */


public class IOOperation {
    public static void main(String[] args) {
        File file = new File("F:\\java_repo\\java_start\\figures\\1.txt");
        if (file.exists() & file.isFile()) {
            String filePathName = file.getAbsolutePath();
            System.out.println(filePathName);
        }

        // 通过字节输入流完成对文件的读取操作
        FileInputStream fI = null;
        try {
            fI = new FileInputStream("F:\\java_repo\\java_start\\figures\\1.txt");
            System.out.println("可以读取到的字节数: " + fI.available());
            // read() 方法读取文件
            int data;
            while ((data = fI.read()) != -1) {
                System.out.println((char) data);
            }
            System.out.println("可以读取到的字节数: " + fI.available());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fI.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("F:\\java_repo\\java_start\\figures\\2.txt");

            String info = "java";
            // 将写入的字符串打散为一个字节数组
            byte[] infos = info.getBytes();
            fos.write(infos, 0, infos.length);
            System.out.println("文件已经更新.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


/*

File


流  --  流是一组有序的数据序列, 以先进先出的方式发送信息的通道
    输入流 InputStream(字节流, 8位通用字节流) 和 Reader(字符流, 16位Unicode字符流) 作为基类
    输出流 OutputStream 和 Writer 作为基类

    输入输出流是相对于计算机内存来说的








 */