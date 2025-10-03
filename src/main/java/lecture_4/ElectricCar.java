package lecture_4;

public class ElectricCar extends Car{
    private double batteryPower;

    public ElectricCar(String manufacturer, String model,
                       double price,
                       double batteryPower) {
        super(manufacturer, model, price);
        this.batteryPower = batteryPower;
    }

    @Override
    public void startEngine() {
        System.out.println(
                "Электрический двигатель запущен.");
    }
}
