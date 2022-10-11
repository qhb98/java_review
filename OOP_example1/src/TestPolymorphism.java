/**
 * @Description: 测试多态
 * @Author: QHB
 * @Date: 2022/10/11 16:52
 */
public class TestPolymorphism {
    public static void main(String[] args) {
        animalCry(new Dog());
        animalCry(new Cat());
    }

    static void animalCry(Animal a) {
        System.out.println("TestPolymorphism.animalCry");
        a.shout();
        // 多态 只能访问到父类引用指向的子类对象的重写的方法
    }
}


class Animal {
    public void shout() {
        System.out.println("叫喊");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }

    public void seeDoor() {
        System.out.println("看门");
    }

}


class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }

}