/**
 * @Description: 测试构造方法的重载
 * @Author: QHB
 * @Date: 2022/10/10 15:55
 */
public class User {
    int id;
    String name;
    String pwd;

    User(int _id){
        // this指对象的成员变量id就是_id
        this.id = _id;

    }

    public User(int _id, String _name){
        this.id = _id;
        this.name = _name;
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public static void main(String[] args) {
        User u1 = new User(0);
        User u2 = new User(1, "da");
        User u3 = new User(1, "da", "qwe");

    }
}
