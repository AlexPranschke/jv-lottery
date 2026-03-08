package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 100;
    private static final Random RANDOM = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), RANDOM.nextInt(MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE);
    }
}
