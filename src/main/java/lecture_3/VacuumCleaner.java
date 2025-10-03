package lecture_3;

public class VacuumCleaner {
    private static int counter = 0;
    private int productId;
    private String manufacturer;
    private String model;
    private float power;
    private double price;

    public VacuumCleaner(String manufacturer, String model, float power, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.power = power;
        this.price = price;
        counter++;
        this.productId = counter;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public float getPower() {
        return power;
    }

    public double getPrice() {
        return price;
    }
}
