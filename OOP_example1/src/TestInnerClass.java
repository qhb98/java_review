/**
 * @Description: 测试内部类
 * @Author: QHB
 * @Date: 2022/10/11 21:49
 */
public class TestInnerClass {
    public static void main(String[] args) {

    }
}

class Outer {
    private int age = 10;

    public void show() {
        System.out.println("outer.show.");
        System.out.println(age);
    }

    private class Inner {
        int age = 20;

        public void show() {
            System.out.println("inner.show");
            System.out.println(age);
        }


    }
}


