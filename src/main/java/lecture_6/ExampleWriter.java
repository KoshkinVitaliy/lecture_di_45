package lecture_6;

import java.io.*;

public class ExampleWriter {
    private File file;

    public void createFile() {
        file = new File(
                "src/main/java/lecture_6/text.txt");

        if (file.exists()) {
            System.out.println("Файл уже существует!");
        }
        else {
            try {
                FileWriter writer = new FileWriter(file);

                writer.write("Наш первый файл!");
                System.out.println("Файл успешно создан!");

                writer.close();
            }
            catch (IOException ex) {
                System.out.println("Ошибка создания файла: " + ex.getMessage());
            }

        }
    }

    public void readFile() {
        createFile();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while((line = reader.readLine()) != null) {
                System.out.print(line + "\n");
            }
        }
        catch (IOException exception) {
            System.out.println("Ошибка чтения файла: " + exception.getMessage());
        }
    }
}
