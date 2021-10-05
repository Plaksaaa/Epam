package by.epamtc.krukovichmaxim.ball_task;

import by.epamtc.krukovichmaxim.ball_task.exception.ColorException;

public enum Color {
    RED,
    BLUE,
    GREEN,
    BLACK,
    WHITE,
    PINK;

    public static Color getColor(String color) throws ColorException {
        for (Color o : values()) {
            if (color.equalsIgnoreCase(o.name())){
                return o;
            }
        }
        throw new ColorException(String.format("Not found color with code: %s.", color));
    }
}
