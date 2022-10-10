/**
 * @Description: 程序执行过程中的内存分析
 * @Author: QHB
 * @Date: 2022/10/10 16:17
 */

public class Person {

    String name;
    int age;

    public void show(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        // 创建p1对象
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "张三";
        p1.show();

        // 创建p2对象
        Person p2 = new Person();
        p2.age = 45;
        p2.name = "李四";
        p2.show();

        Person p3 = p1;
        Person p4 = p1;

        p4.age = 80;
        System.out.println(p1.age);
        System.out.println(p4.age);

    }

}
/*
参数传值机制

java中, 方法中所有参数都是 值传递, 也就是说, 传递的是值的副本.
基本数据类型参数的传值, 传递的是值的副本, 副本改变不会影响原件.
引用类型参数的传值, 传递的是值的副本. 但是引用类型指的是对象的地址. 因此, 副本和
原参数都指向了同一个地址, 改变副本指向地址对象的值, 也意味着原参数指向对象的值也发生了改变





url: https://www.bilibili.com/video/BV1za411C7ZD/?p=63&spm_id_from=pageDriver&vd_source=7111d4cfa9354342c253c06ecdd64e2f

*/