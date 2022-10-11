/**
 * @Description: 测试接口
 * @Author: QHB
 * @Date: 2022/10/11 20:52
 */


public class TestInterface {
    public static void main(String[] args) {
        Angel a = new Angel();
        a.fly();
        a.helpOther();
        System.out.println(Volant.FLY_HEIGHT);
        System.out.println(a.toString());

        Volant a2 = new Angel();
        a2.fly();
        System.out.println(a2.toString());

    }
}

interface Volant {
    int FLY_HEIGHT = 100;

    public abstract void fly();
}

interface Honest {
    void helpOther();
}

class GoodMan implements Honest {
    @Override
    public void helpOther() {
        System.out.println("过马路");
    }
}

class BirdMan implements Volant {
    @Override
    public void fly() {
        System.out.println("我在飞.");
    }
}

class Angel implements Volant, Honest {
    @Override
    public void fly() {
        System.out.println("Angel.fly.");
    }

    @Override
    public void helpOther() {
        System.out.println("Angel.helpOther.");
    }
}