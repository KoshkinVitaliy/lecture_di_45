package lecture_5;

public class Duck implements Swimmable{

    @Override
    public void swim() {
        System.out.println("Вжух-вжух лапками");
    }

    interface TestInterface {
        void test();
    }
}
