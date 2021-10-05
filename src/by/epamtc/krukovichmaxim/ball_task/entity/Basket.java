package by.epamtc.krukovichmaxim.ball_task.entity;

import by.epamtc.krukovichmaxim.ball_task.color.Color;

import java.util.List;
import java.util.Objects;

public class Basket {
    private Color color;
    private String material;
    private List<Ball> balls;

    public Basket(Color color, String material, List<Ball> balls) {
        this.color = color;
        this.material = material;
        this.balls = balls;
    }

    public Basket() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return getColor() == basket.getColor() &&
               Objects.equals(getMaterial(), basket.getMaterial()) &&
               Objects.equals(getBalls(), basket.getBalls());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getMaterial(), getBalls());
    }

    @Override
    public String toString() {
        return "Basket{" +
               "color=" + color +
               ", material='" + material + '\'' +
               ", balls=" + balls +
               '}';
    }
}
