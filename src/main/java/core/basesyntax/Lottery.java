package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 100;
    private static final Random RANDOM = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int size = RANDOM.nextInt(MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE;
        return new Ball(color, size);
    }
}
