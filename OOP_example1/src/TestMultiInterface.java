/**
 * @Description: 测试接口的多继承
 * @Author: QHB
 * @Date: 2022/10/11 21:10
 */
public class TestMultiInterface {
    public static void main(String[] args) {

        C c = new CImpl01();
        c.testA();
        c.testB();
        c.testC();

    }
}

interface A {
    void testA();
}

interface B {
    void testB();
}

interface C extends A, B{
    @Override
    default void testA(){
        System.out.println("重写A");
    };

    @Override
    default void testB(){
        System.out.println("重新B");
    };

    void testC();

}

class CImpl01 implements C{
    @Override
    public void testA() {
        C.super.testA();
    }

    @Override
    public void testB() {
        C.super.testB();
    }

    @Override
    public void testC() {

    }
}