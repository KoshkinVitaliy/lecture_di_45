package lecture_4;

import java.util.Scanner;

public class HybridCar extends ElectricCar{
    private double enginePower;


    public HybridCar(String manufacturer, String model,
                     double price,
                     double batteryPower,
                     double enginePower) {
        super(manufacturer, model, price, batteryPower);

        this.enginePower = enginePower;
    }

    public double getEnginePower() {
        return enginePower;
    }

    @Override
    public void startEngine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите тип двигателя:");
        int choice = sc.nextInt();
        sc.close();

        if(choice == 1) {
            System.out.println("Двигатель ДВС запущен.");
        }
        else {
            System.out.println("Электрические двигатели запущены.");
        }
    }
}
