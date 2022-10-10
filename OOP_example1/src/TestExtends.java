/**
 * @Description: 继承
 * @Author: QHB
 * @Date: 2022/10/10 21:44
 */
public class TestExtends {
    public static void main(String[] args) {
        StudentE s1 = new StudentE("高期", 123, "java");
        System.out.println(s1.name);
        s1.study();
    }
}

class PersonE {
    String name;
    int height;

    public void rest() {
        System.out.println("休息");
    }

}

class StudentE extends PersonE {
    String major;

    public void study() {
        System.out.println("学习");

        rest();
        System.out.println(this.name);
    }

    public StudentE(String _name, int _height, String _major){
        this.name = _name;
        this.major = _major;
        this.height = _height;
    }

}