/**
 * @Description: 静态static初始化
 * @Author: QHB
 * @Date: 2022/10/10 21:14
 */
public class TestStatic {
    static String company;

    static {
        System.out.println("执行类的初始化工作.");

        company = "百战程序员";
        printCompany();
    }

    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {


    }
}
