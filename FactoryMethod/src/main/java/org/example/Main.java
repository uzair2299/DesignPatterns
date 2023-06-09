package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PointFactory pointFactory = new PointFactory();
        Point polarPoint = pointFactory.createPoint("polar");
        polarPoint.draw();
    }
}