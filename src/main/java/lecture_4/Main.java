package lecture_4;

public class Main {
    public static void main(String[] args) {

        Car car = new HybridCar("rthrth",
                "reger", 100, 100,1);

        car = new ElectricCar("", "",56, 10);

        car.startEngine();
//        Car car = new Car(
//                "Porsche",
//                "Panamera",
//                23_000_000
//        );
//
//        car.startEngine();
//
//        ElectricCar electricCar = new ElectricCar(
//                "Tesla",
//                "Plaid",
//                10_000_000,
//                800
//        );
//
//        electricCar.startEngine();
//
//        HybridCar hybridCar = new HybridCar(
//                "Lixiang", "Li9",
//                7_000_000,
//                500,
//                300
//        );
//
//        hybridCar.startEngine();
    }
}
