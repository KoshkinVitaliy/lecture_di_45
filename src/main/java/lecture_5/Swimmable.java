package lecture_5;

public interface Swimmable {
    int CONST_A = 3;
    default void swim() {
        System.out.println("Я не умею плавать :(");
        fly();
    }

    private void fly() {
        System.out.println("Типо летаю");
    }
    void test();
}
