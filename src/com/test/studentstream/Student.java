package com.test.studentstream;

import java.io.Serializable;

/**
 * @Description:
 * @Author: QHB
 * @Date: 2022/10/13 14:46
 */
public class Student implements Serializable {
    private int age;
    private String name;
    private String sex;
    private String password;


    public Student(int age, String name, String sex, String password) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getPassword() {
        return password;
    }
}
