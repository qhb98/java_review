package com.basic;

import java.util.Scanner;

/**
 * @Description: 键盘输入scanner
 * @Author: QHB
 * @Date: 2022/10/9 16:32
 */

public class TestScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("请输入用户名: ");
        String uname = s.nextLine();

        System.out.println("请输入你的年龄: ");
        int age = s.nextInt();

        System.out.println("请输入月薪: ");
        double monthSalary = s.nextDouble();

        System.out.println("用户名" + uname);
        System.out.println("年龄" + age);
        System.out.println("月薪" + monthSalary);

    }
}
