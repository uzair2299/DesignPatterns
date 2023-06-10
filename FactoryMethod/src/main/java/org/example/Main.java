package org.example;


/*
 * To implement the factory pattern, also known as the factory method pattern, you can follow these steps:
 * 1:-Define an abstract base class or interface: Create an abstract class or interface that represents the common behavior of the objects you want to create. This class will serve as the product.
 * 2:-Create concrete classes: Implement concrete classes that inherit from the abstract base class or implement the interface. Each concrete class represents a specific type of object you want to create.
 * 3:-Define a factory class: Create a factory class that contains a method for creating objects. This method will encapsulate the creation logic and return instances of the abstract base class or interface.
 * 4:-Implement the factory method: In the factory class, implement the factory method. This method should take in parameters if necessary and use them to determine which concrete class to instantiate. It should create an instance of the concrete class and return it as an instance of the abstract base class or interface.
 *
 *
 * */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PointFactory pointFactory = new PointFactory();
        Point polarPoint = pointFactory.createPoint("polar");
        polarPoint.draw();
        Point cartesianPoint = pointFactory.createPoint("cartesian");
        if (cartesianPoint instanceof CartesianPoint) {
            CartesianPoint cartesianPoint_ = (CartesianPoint) cartesianPoint;
            double distance = cartesianPoint_.calculateDistance();
            System.out.println(distance);
        }
    }
}