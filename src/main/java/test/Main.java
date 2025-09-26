package test;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(
                "White",
                5,
                new Point(10, 10));
        Shape rectangle = new Rectangle(
                "Red",
                10,
                50
        );

        Shape[] shapes = new Shape[2];
        shapes[0] = circle;
        shapes[1] = rectangle;

        System.out.print("Общая площадь всех фигур: ");
        System.out.println(AreaCalculator.printTotalArea(shapes));
        circle.displayInfo();
    }
}
