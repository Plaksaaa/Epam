package by.epamtc.krukovichmaxim.task03.array_task.util;

import by.epamtc.krukovichmaxim.task03.array_task.entity.Array;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public final class ArrayUtil {

    private static final Scanner scanner = new Scanner(System.in);

    private ArrayUtil() {
    }

    public static void printArray(Array array) {
        for (int i : array.getArray()) {
            System.out.println(i);
        }
    }

    public static Array fillFromFile(Path path) throws IllegalArgumentException, IOException {
        Array array = null;

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextInt()) {
                array = new Array(new int[scanner.nextInt()]);
            }
        }
        return array;
    }

    public static Array getRandomArray(int length, int bound) {
        Array array = new Array(new int[length]);

        for (int i = 0; i < length; i++) {
            array.getArray()[i] = ThreadLocalRandom.current().nextInt(bound);
        }
        return array;
    }


    public static Array readArray(int length) {
        Array array = new Array(new int[length]);

        for (int i = 0; i < length; i++) {
            array.getArray()[i] = scanner.nextInt();
        }
        return array;
    }

}
