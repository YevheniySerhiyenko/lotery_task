package basesyntax;

import core.basesyntax.ColorSupplier;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lottery {

    private static final Integer MAX_RANDOM_NUMBER = 100;

    private final core.basesyntax.ColorSupplier colorSupplier;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        final Color randomColor = colorSupplier.getRandomColor();
        final int randomNumber = new Random().nextInt(MAX_RANDOM_NUMBER);
        return new Ball(randomColor, randomNumber);
    }

    public List<Ball> getRandomBalls(final int ballsQuantity) {
        return IntStream.range(0, ballsQuantity)
                .mapToObj((number) -> {
                    final Color randomColor = colorSupplier.getRandomColor();
                    final int randomNumber = new Random().nextInt(MAX_RANDOM_NUMBER);
                    return new Ball(randomColor, randomNumber);
                }).collect(Collectors.toList());
    }

}
