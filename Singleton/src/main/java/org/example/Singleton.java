package org.example;

/*
 * When implementing the Singleton design pattern in Java, there are a few key points to consider:
 * Private Constructor: The Singleton class should have a private constructor to prevent direct instantiation from outside the class. This ensures that the Singleton instance can only be accessed through a defined method.
 * Static Instance: The Singleton class should have a static member variable that holds the single instance of the class. It should be private and static to ensure there is only one instance across the application.
 * Lazy Initialization (optional): You can choose to lazily initialize the Singleton instance, which means it is created only when it is first accessed.
 * Thread Safety: If your application is multi-threaded, you need to consider thread safety when implementing the Singleton pattern.
 * Access Method: Provide a static method that allows access to the Singleton instance. This method should check if the instance is null and create it if necessary before returning it.
 * */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (!instance.equals(null)) {
            instance = new Singleton();
        }
        return instance;
    }

}
