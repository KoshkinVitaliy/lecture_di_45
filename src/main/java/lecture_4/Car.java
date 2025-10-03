package lecture_4;

public class Car {
    private String manufacturer;
    private String model;
    private double price;

    public Car(String manufacturer, String model, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void openDoors() {
        System.out.println("Doors are open");
    }

    public void closeDoors() {
        System.out.println("Doors are closed");
    }

    public void startEngine() {
        System.out.println("Двигатель запущен.");
    }
}
