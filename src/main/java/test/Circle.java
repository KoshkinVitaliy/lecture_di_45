package test;

public class Circle extends Shape {
    private double radius;
    private final Point center;
    private static final double MATH_PI = 3.14159;


    public Circle(String color, double radius, Point center) {
        super(color);
        this. radius = radius;
        this.center = center;
    }

    @Override
    public double calculateArea() {
        return MATH_PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Центр круга: (" + center.getX() + ", " + center.getY() + ")");
    }
}
