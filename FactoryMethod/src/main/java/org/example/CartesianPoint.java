package org.example;

public class CartesianPoint implements Point{

    @Override
    public void draw() {
        System.out.println("Drawing a point in CartesianPoint coordinates");
    }
    public double calculateDistance() {
        // Calculate and return the distance for Cartesian coordinates
        return 0.0;
    }
}
