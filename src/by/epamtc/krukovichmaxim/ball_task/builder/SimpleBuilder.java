package by.epamtc.krukovichmaxim.ball_task.builder;

import by.epamtc.krukovichmaxim.ball_task.color.Color;
import by.epamtc.krukovichmaxim.ball_task.entity.Ball;
import by.epamtc.krukovichmaxim.ball_task.entity.Basket;
import by.epamtc.krukovichmaxim.ball_task.exception.ColorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class SimpleBuilder {
    private static final Scanner sc = new Scanner(System.in);

    private SimpleBuilder() {
    }

    public static Basket createBasket() throws ColorException {
       return new Basket(Color.getColor(sc.nextLine()), sc.nextLine(),
               ballFills(Integer.parseInt(sc.nextLine())));
    }

    private static List<Ball> ballFills(int size) throws ColorException {
        int counter = 0;
        List<Ball> balls = new ArrayList<>(size);
        while (counter < size) {
            balls.add(new Ball(Integer.parseInt(sc.nextLine()), Color.getColor(sc.nextLine())));
            counter++;
        }
        return balls;
    }

}