package by.epamtc.krukovichmaxim.task7.runner;

import by.epamtc.krukovichmaxim.task7.entity.Point;
import by.epamtc.krukovichmaxim.task7.service.PointService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PointRunner {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        PointService pointService = new PointService();

        try {
            Point firstPoint = new Point(scanner.nextDouble(), scanner.nextDouble());
            Point secondPoint = new Point(scanner.nextDouble(), scanner.nextDouble());

            System.out.println(pointService.getNearestPoint(firstPoint, secondPoint));
        } catch (InputMismatchException e){
            System.out.println("Not correct point");
        }
    }
}
