package basesyntax;

import java.util.Random;

public enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    ORANGE,
    PURPLE,
    PINK,
    BROWN,
    BLACK,
    WHITE,
    GRAY,
    CYAN,
    MAGENTA,
    LIME,
    TEAL,
    INDIGO,
    VIOLET,
    MAROON,
    NAVY,
    OLIVE,
    SILVER,
    GOLD,
    AQUA;

    public static Color getRandomColor() {
        final Color[] values = Color.values();
        return values[new Random().nextInt(values.length)];
    }
}

