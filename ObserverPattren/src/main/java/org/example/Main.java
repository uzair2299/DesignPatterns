package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
* The Observer design pattern is a behavioral design pattern that allows objects to establish a one-to-many relationship, where multiple dependent objects, known as observers, are notified and updated automatically when the state of a subject object changes. This pattern is also known as the Publish-Subscribe pattern.
*Subject: The subject is an object that holds the state and maintains a list of observers. It provides methods to attach, detach, and notify observers. When the subject's state changes, it notifies all registered observers.
*Observer: The observer is an interface or an abstract class that defines the update method. The update method is called by the subject when its state changes, and it allows the observer to update itself based on the new state.
*Concrete Subject: The concrete subject is a specific implementation of the subject interface. It maintains the state and sends notifications to registered observers when the state changes.
*Concrete Observer: The concrete observer is a specific implementation of the observer interface. It registers itself with the subject to receive notifications and implements the update method to perform the necessary actions when notified.
*
*
*
*
* */
public class Main {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final int MAX_NAME_LENGTH = 8;
    public static List<User> generateRandomName(){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        List<User> users = new ArrayList<>();
        for(int j=0;j<=1000;j++) {
            for (int i = 0; i <= MAX_NAME_LENGTH; i++) {
                char randomChar = ALPHABET.charAt(random.nextInt(26));
                stringBuilder.append(randomChar);
            }
            User user = new User(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            users.add(user);
        }
        return users;
    }
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        List<User> users =  generateRandomName();
        for (User user: users){
            weatherStation.attach(user);
        }
        weatherStation.setTemperature(25); // Notifies both users

        weatherStation.setTemperature(30);

        System.out.println("Hello world!");
    }
}