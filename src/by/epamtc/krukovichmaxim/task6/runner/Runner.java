package by.epamtc.krukovichmaxim.task6.runner;

import by.epamtc.krukovichmaxim.task6.service.TimeService;

import java.util.Scanner;

public class Runner {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(TimeService.calculateHours(scanner.nextDouble()));
        System.out.println(TimeService.calculateMinutes(scanner.nextDouble()));
        System.out.println(TimeService.getSeconds(scanner.nextDouble()));
    }
}
