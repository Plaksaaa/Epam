package by.epamtc.krukovichmaxim.task8.runner;

import by.epamtc.krukovichmaxim.task8.service.FunctionService;

import java.util.Scanner;

public class Runner {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        FunctionService functionService = new FunctionService();
        System.out.println(functionService.calculateFunction(scanner.nextDouble()));
    }
}
