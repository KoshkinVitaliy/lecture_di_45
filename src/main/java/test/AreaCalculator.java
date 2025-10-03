package test;

public class AreaCalculator {
    public static final double MATH_PI = 3.14159;

    public static double printTotalArea(Shape[] shapes) {
        double squareSum = 0;
        for (int i = 0; i < shapes.length; i++) {
            squareSum += shapes[i].calculateArea();
        }

        return squareSum;
    }
}
