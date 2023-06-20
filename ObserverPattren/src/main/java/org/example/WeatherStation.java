package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WeatherStation implements Subject{
    private List<Observer> observers = new ArrayList<>();

    private int temperature;
    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void notifyObservers() {
        try {
            Thread.sleep(500000);
            for (Observer observer : observers) {
                observer.update(temperature);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
