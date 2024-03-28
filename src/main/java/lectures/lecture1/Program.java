package lectures.lecture1;

import static lectures.lecture1.Point2D.distance;

public class Program {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        Point2D b = new Point2D(10, 10);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.getY());
        System.out.println(distance(a, b));
    }
}
