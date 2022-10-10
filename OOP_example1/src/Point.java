/**
 * @Description: 定义点, 使用构造器
 * @Author: QHB
 * @Date: 2022/10/10 15:01
 */
public class Point {
    double x, y;

    //构造器
    Point(double _x, double _y){
        this.x = _x;
        this.y = _y;
    }

    public double getDistance(Point p){
        return Math.sqrt((x - p.x)*(x - p.x) + (y - p.y)*(y - p.y));
    }

    public static void main(String[] args) {
        Point p1 = new Point(3.0, 4.0);

        Point origin = new Point(0, 0);

        System.out.println(p1.getDistance(origin));
    }

}

/*



 */
