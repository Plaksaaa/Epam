package by.epamtc.krukovichmaxim.ball_task.service;

import by.epamtc.krukovichmaxim.ball_task.Color;
import by.epamtc.krukovichmaxim.ball_task.entity.Ball;

import java.util.List;
import java.util.Optional;

public class BallService {
    public static Optional<Integer> getBallsWeight(List<Ball> balls){
       return balls.stream()
                .map(Ball::getWeight)
                .reduce(Integer::sum);
    }

    public static long getBlueBallsCount(List<Ball> balls){
       return balls.stream()
                .filter(ball -> ball.getColor().equals(Color.BLUE))
                .count();
    }
}
