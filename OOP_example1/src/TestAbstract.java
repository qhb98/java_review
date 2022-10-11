/**
 * @Description: 测试抽象方法和抽象类
 * @Author: QHB
 * @Date: 2022/10/11 20:38
 */
public class TestAbstract {

}

abstract class Animal1{
    int age;
    String kind;

    public abstract void rest();
    public abstract void run();
    public void shout(){
        System.out.println("Animal.shout");
        // 不能new类
    }
}

class Dog1 extends Animal1{

    @Override
    public void rest() {
        System.out.println("dog rest.");
    }

    @Override
    public void run() {
        System.out.println("dog run.");
    }
}

class Cat1 extends Animal1{

    @Override
    public void rest() {
        System.out.println("cat rest.");
    }

    @Override
    public void run() {
        System.out.println("cat run.");
    }
}