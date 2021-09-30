package by.epamtc.krukovichmaxim.task4.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static by.epamtc.krukovichmaxim.task4.service.DigitService.evenNumbers;

public class Runner {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(4);

        while (list.size() < 4){
            list.add(sc.nextInt());
        }

        System.out.println(evenNumbers(list));
    }
}
