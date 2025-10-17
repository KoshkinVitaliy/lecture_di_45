package lecture_7;

import java.util.ArrayList;
import java.util.List;

public class MyCollection {
    private static List<String> data = new ArrayList<>();

    public static List<String> getData() {
        return data;
    }

    static {
        data.add("Аня");
        data.add("Петя");
        data.add("Евлампий");
        data.add("Иннокентий");
        data.add("Ашот");
        data.add("Василий");
        data.add("Ева");
        data.add("Дарья");
    }

    public static void removeBoys() {
        for (int i = 0; i < data.size(); i++) {
            if (!data.get(i).equals("Дарья")
                    && !data.get(i).equals("Ева")
                    && !data.get(i).equals("Аня")) {
                data.remove(data.get(i));
                i--;
            }
        }
    }
}
