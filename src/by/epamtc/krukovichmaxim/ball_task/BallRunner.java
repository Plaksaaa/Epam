package by.epamtc.krukovichmaxim.ball_task;


public class BallRunner {
    public static void main(String[] args) {
        try {
            System.out.println(SimpleBuilder.createBasket());
        } catch (ColorException e) {
            e.printStackTrace();
        }
    }
}
