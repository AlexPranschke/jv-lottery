package core.basesyntax;
public class Lottery {
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 100;
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int randomSize = (int) (Math.random() * (MAX_SIZE - MIN_SIZE + 1)) + MIN_SIZE;
        return new Ball(randomColor, randomSize);
    }
}