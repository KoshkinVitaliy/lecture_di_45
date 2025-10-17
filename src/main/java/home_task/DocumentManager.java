package home_task;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentManager {
    public static List<Document> documents = new ArrayList<>();

    public static void addDocument(Document document) {
        documents.add(document);
    }

    public static void displayAllDocuments() {
        System.out.println(documents);
    }

    public static void showDocumentDetails(int documentIndex) {
        documents.get(documentIndex).display();
    }

    public static void saveAllDocuments(String directory) {
        File dir = new File(directory);
        if(!dir.exists()) {
            dir.mkdirs();
        }

        for (int i = 0; i < documents.size(); i++) {
            String fileName = directory + "/document_" + (i + 1) + ".txt";
            try {
                documents.get(i).saveToFile(fileName);
            } catch (IOException e) {
                System.out.println("Не удалось создать файл для документа: " + e.getMessage());
            }
            System.out.println("Документ сохранён: " + fileName);
        }
    }

    public static void loadDocument(String fileName, String type) {
        Document doc;

        if("TextDocument".equals(type)) {
            doc = new TextDocument("", "");
        }
        else if("ReportDocument".equals(type)) {
            doc = new ReportDocument("", "", "");
        }
        else {
            throw new IllegalArgumentException("Неизвестный тип документа: " + type);
        }

        try {
            doc.loadFromFile(fileName);
            documents.add(doc);
            System.out.println("Загружен документ: " + doc.title);
        } catch (IOException e) {
            System.out.println("Ошибка выгрузки документа: " + e.getMessage());
        }
    }
}
