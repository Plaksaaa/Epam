package by.epamtc.krukovichmaxim.task7.service;

import by.epamtc.krukovichmaxim.task7.entity.Point;

public class PointService {

    public Point getNearestPoint(Point firstPoint, Point secondPoint){
        if (calculatePointDistance(firstPoint) > calculatePointDistance(secondPoint)){
            return secondPoint;
        } else if (calculatePointDistance(firstPoint) < calculatePointDistance(secondPoint)){
            return firstPoint;
        } else {
            return new Point(0,0);
        }
    }

    private double calculatePointDistance(Point point) {
        return (Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));
    }

}
