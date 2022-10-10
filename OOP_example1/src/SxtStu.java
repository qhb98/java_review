/**
 * @Description:
 * @Author: QHB
 * @Date: 2022/10/10 14:20
 */
public class SxtStu {
    int id;
    int age;
    String name;

    public void study() {
        System.out.println("正在学习, 请勿打扰!");
    }

    public void kickball() {
        System.out.println("正在踢球.");
    }

    public static void main(String[] args) {

        SxtStu s1 = new SxtStu();

        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.name);

        s1.id = 1001;
        s1.age = 11;
        s1.name = "大叔";
        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.name);

    }

}
