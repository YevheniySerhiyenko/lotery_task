package basesyntax;

import java.util.List;

public class Application {

    private final static Integer NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        final Lottery lottery = new Lottery();
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            final Ball randomBall = lottery.getRandomBall();
            System.out.println(randomBall);
        }

        //or

        final List<Ball> randomBalls = lottery.getRandomBalls(NUMBER_OF_BALLS);
        randomBalls.forEach(System.out::println);
    }
}
