package test;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
