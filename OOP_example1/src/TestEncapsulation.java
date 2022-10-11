/**
 * @Description: 测试封装
 * @Author: QHB
 * @Date: 2022/10/11 16:18
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        User11 u1 = new User11(1, "da1", false);

//        u1.setId(100);
//        u1.setName("da");
//        u1.setMan(true);

        System.out.println(u1.getId());
        System.out.println(u1.getName());
        System.out.println(u1.isMan());
    }
}

class User11{
    private int id;
    private String name;
    private boolean man;

    public void printUserInfo(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(man);
    }

    // 构造器
    public User11(int id, String name, boolean man) {
        this.id = id;
        this.name = name;
        this.man = man;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isMan() {
        return man;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}