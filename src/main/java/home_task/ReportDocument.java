package home_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReportDocument extends Document {
    private String department;
    private int pageCount;
    private String content;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public ReportDocument(String title, String author) {
        super(title, author);
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Текстовый документ");
        System.out.println(getSummary());
        System.out.println("Содержимое:");
        System.out.println(content);
    }

    @Override
    public boolean saveToFile(String fileName) throws IOException {
        StringBuilder fileContent = new StringBuilder();

        fileContent.append("Заголовок: ").append(title).append("\n");
        fileContent.append("Автор: ").append(author).append("\n");
        fileContent.append("Дата создания: ").append(createdDate).append("\n");
        fileContent.append("Дата изменения: ").append(modifiedDate).append("\n");
        fileContent.append("Отдел: ").append(department).append("\n");
        fileContent.append("Количество страниц: ").append(pageCount).append("\n");
        fileContent.append(content);

        Path path = Paths.get(fileName);

        Files.write(path, fileContent.toString().getBytes());

        return true;
    }

    @Override
    public void loadFromFile(String fileName) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while((line = reader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        }
        catch (IOException exception) {
            System.out.println("Ошибка чтения файла: " + exception.getMessage());
        }

        this.content = contentBuilder.toString();
    }
}
