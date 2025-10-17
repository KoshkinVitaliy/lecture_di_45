package home_task;

public class Main {
    public static void main(String[] args) {
        TextDocument document = new TextDocument(
                "Мой первый документ",
                "Анна Александрова");

        document.setContent("Ребята мутят какой-то контент!");
        document.display();

        ReportDocument reportDoc = new ReportDocument(
                "Годовой отчет 2024",
                "Петр Петров",
                "Бухгалтерия"
        );
        reportDoc.setContent("Финансовые показатели за 2024 год:\n- Выручка: " +
                "1,000,000 руб.\n- Прибыль: 200,000 руб.\n- Расходы: 800,000 руб.");

        DocumentManager.addDocument(document);
        DocumentManager.addDocument(reportDoc);

        TextDocument anotherTextDoc = new TextDocument(
                "Заметки о Java",
                "Анна Сидорова"
        );
        anotherTextDoc.setContent("Интерфейсы в Java:\n- Определяют контракт\n- " +
                "Поддерживают множественное наследование\n\nАбстрактные классы:\n- " +
                "Могут содержать реализацию\n- Поддерживают состояние");

        DocumentManager.addDocument(anotherTextDoc);

        DocumentManager.displayAllDocuments();

        DocumentManager.saveAllDocuments("src/main/java/home_task");

    }
}
