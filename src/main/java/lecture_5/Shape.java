package lecture_5;

public abstract class Shape {
    int x;
    int y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void print();
}
