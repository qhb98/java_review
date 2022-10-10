/**
 * @Description: 测试this的用法
 * @Author: QHB
 * @Date: 2022/10/10 17:00
 */
public class TestThis {
    int a, b, c;

    TestThis(){
        System.out.println("正要初始化对象: " + this);
    }

    TestThis(int a, int b){
        // TestThis() 这样是无法调用构造方法的
        this(); // 调用无参的构造方法, 并且必须位于第一行
//        a = a; // 这是局部变量, 而不是成员变量

        // 使用this区分成员变量和局部变量
        this.a = a;
        this.b = b;
    }

    TestThis(int a, int b, int c){
        this(a, b); // 调用带参的构造方法, 必须位于第一行
        this.c = c;
    }

    void sing(){

    }

    void eat(){
        System.out.println("当前对象" + this);
        this.sing();
        System.out.println("你妈妈喊你回家吃饭.");
    }

    public static void main(String[] args) {
        TestThis hi = new TestThis(2, 3);
        hi.eat();
    }



}
