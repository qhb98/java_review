package com.basic;

/**
 * @Description: 继承和组合
 * @Author: QHB
 * @Date: 2022/10/11 14:40
 */
public class Combination {
    public static void main(String[] args) {

    }
}

class PersonE2 {
    String name;
    int height;

    public void rest() {
        System.out.println("休息");
    }

}

class StudentE2 extends PersonE2 {
    PersonE2 person2 = new PersonE2();
    // 组合

    String major;

    public void study() {
        System.out.println("学习");

        person2.rest();
        System.out.println(this.person2.name);
    }

    public StudentE2(String _name, int _height, String _major) {
        this.person2.name = _name;
        this.major = _major;
        this.person2.height = _height;
    }

}

/*

组合很灵活, 可以复用很多类的代码, 继承只能有一个父类, 但是组合可以有多个数学,


 */