package by.epamtc.krukovichmaxim.ball_task;

public class ColorException extends Throwable {
    public ColorException() {
    }

    public ColorException(String message) {
        super(message);
    }

    public ColorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ColorException(Throwable cause) {
        super(cause);
    }
}
