package lecture_1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat((byte)3, "Маруся");

        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());

        cat1.setName("Вася");

        System.out.println(cat1.getName());
        cat1.meow();
    }
}


