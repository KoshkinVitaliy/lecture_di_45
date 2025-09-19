package lecture_1;

public class Cat {
    private byte age;
    private String name;

    public Cat(byte age, String name) {
        this.name = name;
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("Meow-meow");
    }




    //public - видимость во всей программе
    //private - видимость на уровне класса
    //protected - видимость для классов-наследников
    //default - никак не указывается
}
