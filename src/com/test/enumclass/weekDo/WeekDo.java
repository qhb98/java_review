package com.test.enumclass.weekDo;

/**
 * @Description: 测试枚举的用法和好处
 * @Author: QHB
 * @Date: 2022/10/13 11:04
 */
public class WeekDo {
    public void doWhat(int day) {
        if (day > 7 || day < 1) {
            System.out.println("参数错误, 必须在1-7之间.");
            return;
        }
        switch (day) {
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            default:
                System.out.println("周日");
                break;
        }
    }

    public void doWhat2(Week day) {
        switch (day) {
            case Mon:
                System.out.println("周一");
                break;
            case Tue:
                System.out.println("周二");
                break;
            case Wed:
                System.out.println("周三");
                break;
            case Thu:
                System.out.println("周四");
                break;
            case Fri:
                System.out.println("周五");
                break;
            case Sat:
                System.out.println("周六");
                break;
            default:
                System.out.println("周日");
                break;
        }
    }


    public static void main(String[] args) {
        WeekDo week = new WeekDo();
        week.doWhat2(Week.Mon);
        week.doWhat(1);
    }
}
