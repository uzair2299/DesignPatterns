package org.example;

public class PointFactory {
    public Point createPoint(String pointType) {
        switch (pointType) {
            case "cartesian":
                return new CartesianPoint();
            case "polar":
                return new PolarPoint();
            default:
                throw new IllegalArgumentException("Invalid point type");
        }
    }
}
