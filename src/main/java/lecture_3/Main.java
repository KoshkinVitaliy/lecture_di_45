package lecture_3;

public class Main {
    public static void main(String[] args) {
        VacuumCleaner cleaner2 = new VacuumCleaner(
                "ergerger",
                "ergergerge",
                100f,
                15_500
        );
        Shop.addVacuumCleaner(cleaner2);
        Shop.showVaccumCleaners();

    }
}
