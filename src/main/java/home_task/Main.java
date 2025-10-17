package home_task;

public class Main {
    public static void main(String[] args) {
        TextDocument document = new TextDocument(
                "Мой первый документ",
                "Анна Александрова");

        document.setContent("Ребята мутят какой-то контент!");
        document.display();
    }
}
