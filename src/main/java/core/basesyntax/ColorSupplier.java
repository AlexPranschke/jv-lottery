package core.basesyntax;

public class ColorSupplier {
    enum colors {
        RED, ORANGE, YELLOW, GREEN, LIGHT_BLUE, BLUE, VIOLET
    }
    public String getRandomColor() {
            int randomIndex = (int) (Math.random() * colors.values().length);
            return colors.values()[randomIndex].name();
    }
}
