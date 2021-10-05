package by.epamtc.krukovichmaxim.task4.service;

import java.util.List;

public class DigitService {

    private DigitService() {
    }

    public static boolean evenNumbers(List<Integer> numbers){
        int counter = 0;
        for (var number : numbers) {
            if (number % 2 == 0){
                counter++;
            }
        }
        return counter >= 2;
    }
}
