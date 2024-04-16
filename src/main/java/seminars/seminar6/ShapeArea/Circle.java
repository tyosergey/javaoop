package seminars.seminar6.ShapeArea;

public class Circle extends Shape {
    private double pi = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return pi * Math.sqrt(radius);
    }
}
