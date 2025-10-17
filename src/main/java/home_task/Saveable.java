package home_task;

import java.io.IOException;

public interface Saveable {
    boolean saveToFile(String fileName) throws IOException;

    void loadFromFile(String fileName) throws IOException;
}
