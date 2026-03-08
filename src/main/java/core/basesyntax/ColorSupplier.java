package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    enum Colors {
        RED, ORANGE, YELLOW, GREEN, LIGHT_BLUE, BLUE, VIOLET
    }

    public String getRandomColor() {
        int randomIndex = RANDOM.nextInt(Colors.values().length);
        return Colors.values()[randomIndex].name();
    }
}
