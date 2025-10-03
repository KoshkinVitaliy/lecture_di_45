package lecture_5;

public class Rectangle extends Shape{
    int width;
    int height;

    Rectangle(int x, int y, int width, int height) {
        super(x, y);

        this.height = height;
        this.width = width;
    }

    @Override
    void print() {
        System.out.printf("Прямоугольник. " +
                "Верхний левый угол: (%d, %d); Ширина: %d; Высота: %d \n",
                x, y, width, height);
    }
}
