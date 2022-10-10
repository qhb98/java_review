/**
 * @Description: 测试方法的重写
 * @Author: QHB
 * @Date: 2022/10/10 22:02
 */
public class TestOverRide {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.run();
        h.getVehicle();
    }
}


class Vehicle {
    public void run() {
        System.out.println("跑....");
    }

    public Vehicle getVehicle() {
        System.out.println("给你一个交通工具.");
        return null;
    }
}

class Horse extends Vehicle {

    @Override
    public void run() {
        System.out.println("马得得得.");
    }

    @Override
    public Horse getVehicle() {
        return new Horse();
    }
}

class Plane extends Vehicle {

}