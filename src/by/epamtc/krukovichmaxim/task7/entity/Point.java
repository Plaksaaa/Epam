package by.epamtc.krukovichmaxim.task7.entity;

import java.io.Serializable;

import static java.util.Objects.hash;

public class Point implements Serializable {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.getX(), getX()) == 0 &&
               Double.compare(point.getY(), getY()) == 0;
    }

    @Override
    public int hashCode() {
        return hash(getX(), getY());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
               "x=" + x +
               ", y=" + y +
               '}';
    }
}
