package com.test.studentstream;

import java.io.*;

/**
 * @Description: 序列化和反序列化 过程
 * @Author: QHB
 * @Date: 2022/10/13 14:47
 */
public class SeriaStu {
    public static void main(String[] args) {
        Student sty = new Student(19, "da", "female", "1234da");

        System.out.println("********************************************************");
        // 对象输出流
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("F:\\java_repo\\java_start\\figures\\1.txt");
            oos = new ObjectOutputStream(fos);

            // 实现对象序列化
            oos.writeObject(sty);

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

        System.out.println("********************************************************");

        // 对象输入流
        ObjectInputStream ois = null;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("F:\\java_repo\\java_start\\figures\\1.txt");
            ois = new ObjectInputStream(fis);

            // 实现对象反序列化
            try {
                Student stu = (Student) ois.readObject();
                System.out.println(stu.getAge());
                System.out.println(stu.getSex());
                System.out.println(stu.getName());
                System.out.println(stu.getPassword());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
