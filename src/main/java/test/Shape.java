package test;

public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0;
    }

    public void displayInfo() {
        System.out.println("Цвет фигуры: " + color);
    }
}
