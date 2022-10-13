package com.test.enumclass;

/**
 * @Description: 学员信息
 * @Author: QHB
 * @Date: 2022/10/13 10:43
 */
public class Student {
    public Genders sex;
    // 性别

    public static void main(String[] args) {
        Student stu = new Student();
        // 枚举保证了sex属性的正确赋值和类型的安全, 易于输入和代码清晰等
        stu.sex = Genders.Male;
    }
}

