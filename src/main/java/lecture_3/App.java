package lecture_3;

import java.util.Scanner;

public class App {
    public static void startApp() {
        System.out.println("1. Просмотреть все роутеры со склада (производитель, модель);");
        System.out.println("2. Добавить новый роутер;");
        System.out.println("3. Удалить старый роутер (по индексу роутера);");
        System.out.println("4. Посмотреть все характеристики конкретного роутера (поиск по индексу).");
        System.out.println("5. Завершить работу приложения.");

        getUserChoice();
    }

    private static void getUserChoice() {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
    }
}
