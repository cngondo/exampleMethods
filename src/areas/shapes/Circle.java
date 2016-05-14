package areas.shapes;

/**
 * Created by ngondo on 5/14/16.
 */
public class Circle {
    final double PI = 3.142;
    double radius;

    public Circle(double radius) {
        double area = PI * radius * radius;
        System.out.print(area);
    }

    public double areaCircle(double r){
        double area = PI * r * r;
        return area;
    }

}
