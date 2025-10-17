package lecture_8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    private static final int ELEMENTS_COUNT = 100_000;

    public static void main(String[] args) {
        //testAddToBeginning();
        //testAddToMiddle();
        testAddToEnd();
    }

    private static void testAddToBeginning() {
        System.out.println("Тестируем вставку в начало: ");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();

        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(0, i);
        }

        long arrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();

        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(0, i);
        }

        long linkedListTime = System.nanoTime() - startTime;

        printResults("ArrayList", arrayListTime, "LinkedList", linkedListTime);
    }

    private static void testAddToMiddle() {
        System.out.println("Тестируем вставку в середину: ");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10_000; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 10_000; i++) {
            linkedList.add(i);
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }

        long arrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();

        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }

        long linkedListTime = System.nanoTime() - startTime;

        printResults("ArrayList", arrayListTime, "LinkedList", linkedListTime);
    }

    private static void testAddToEnd() {
        System.out.println("Тестируем вставку в конец: ");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10_000; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 10_000; i++) {
            linkedList.add(i);
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(arrayList.size() - 1, i);
        }

        long arrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();

        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(linkedList.size() - 1, i);
        }

        long linkedListTime = System.nanoTime() - startTime;

        printResults("ArrayList", arrayListTime, "LinkedList", linkedListTime);
    }


    private static void printResults(String name1, long arrayListTime, String name2, long linkedListTime) {
        System.out.printf("%s: %.3f ms\n", name1, (double) arrayListTime / 1_000_000_000.0);
        System.out.printf("%s: %.3f ms\n", name2, (double) linkedListTime / 1_000_000_000.0);

        if (arrayListTime <  linkedListTime) {
            System.out.printf("%s быстрее в %.1f раз\n", name1, (double) linkedListTime / arrayListTime);
        }
        else {
            System.out.printf("%s быстрее в %.1f раз\n", name2, (double) arrayListTime / linkedListTime);
        }
    }
}
