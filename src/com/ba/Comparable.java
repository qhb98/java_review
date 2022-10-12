package com.ba;

import java.util.Arrays;

/**
 * @Description: comparable接口
 * @Author: QHB
 * @Date: 2022/10/11 22:28
 */
public abstract class Comparable {
    public static void main(String[] args) {
        Man2[] msMans = {
                new Man2(3, "a"),
                new Man2(60, "b"),
                new Man2(1, "c"),
        };

        Arrays.sort(msMans);
        // 数组排序

        System.out.println(Arrays.toString(msMans));

    }


}


class Man2 implements java.lang.Comparable {
    int age;
    int id;
    String name;

    public Man2(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        Man2 man2 = (Man2) o;
        if (this.age < man2.age) {
            return -1;
        }
        return 1;
    }


}

/*

定义比较策略, 多个对象做比较

java中的排序算法底层都依赖comparable接口



 */