package lecture_3;

public class Shop {
    public static VacuumCleaner[] vacuumCleaners = new VacuumCleaner[4];

    static {
        VacuumCleaner cleaner1 = new VacuumCleaner(
                "Sony",
                "Super Vac",
                300f,
                20_000
        );
        VacuumCleaner cleaner2 = new VacuumCleaner(
                "Philips",
                "A-180",
                100f,
                15_500
        );
        VacuumCleaner cleaner3 = new VacuumCleaner(
                "Xiaomi",
                "Pro Max Vac",
                500f,
                10_000
        );
        VacuumCleaner cleaner4 = new VacuumCleaner(
                "Bosch",
                "Mega Bosch",
                1000f,
                100_000
        );

        vacuumCleaners[0] = cleaner1;
        vacuumCleaners[1] = cleaner2;
        vacuumCleaners[2] = cleaner3;
        vacuumCleaners[3] = cleaner4;
    }

    public static void showVaccumCleaners() {
        //вывести все марки и модели пылесосов из массива в консоль построчно
        for(int i = 0; i < vacuumCleaners.length; i++) {
            System.out.println(
                    vacuumCleaners[i].getManufacturer() + " "
                            + vacuumCleaners[i].getModel());
        }
    }

    public static void getInfo(int id) {
        for (int i = 0; i < vacuumCleaners.length; i++) {
            if(vacuumCleaners[i].getProductId() == id) {
                System.out.println(
                        vacuumCleaners[i].getProductId() + " " +
                                vacuumCleaners[i].getManufacturer() + " " +
                                vacuumCleaners[i].getModel() + " " +
                                vacuumCleaners[i].getPower() + " " +
                                vacuumCleaners[i].getPrice()
                );
                break;
            }
            else if(i + 1 == vacuumCleaners.length) {
                System.out.println("Товар с данным идентификатором не найден!");
            }
        }
    }

    public void addVacuumCleaner(VacuumCleaner cleaner) {
        //метод, который должен добавить новый пылесос в массив
    }
}
