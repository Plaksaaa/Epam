package by.epamtc.krukovichmaxim.ball_task;

import java.util.Objects;

public class Ball {
    private int weight;
    private Color color;

    public Ball(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public Ball() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return getWeight() == ball.getWeight() &&
               getColor() == ball.getColor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight(), getColor());
    }

    @Override
    public String toString() {
        return "Ball{" +
               "weight=" + weight +
               ", color=" + color +
               '}';
    }
}
