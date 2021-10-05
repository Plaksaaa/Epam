package by.epamtc.krukovichmaxim.ball_task.runner;


import by.epamtc.krukovichmaxim.ball_task.builder.SimpleBuilder;
import by.epamtc.krukovichmaxim.ball_task.entity.Basket;
import by.epamtc.krukovichmaxim.ball_task.exception.ColorException;
import by.epamtc.krukovichmaxim.ball_task.service.BallService;

public class BallRunner {
    public static void main(String[] args) {
        try {
            Basket basket = SimpleBuilder.createBasket();
            System.out.println(basket);
            System.out.println(BallService.getBallsWeight(basket.getBalls()));
            System.out.println(BallService.getBlueBallsCount(basket.getBalls()));
        } catch (ColorException e) {
            e.printStackTrace();
        }
    }
}
