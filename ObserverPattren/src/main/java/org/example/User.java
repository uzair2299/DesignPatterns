package org.example;

public class User implements Observer{
    private String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(name + " received temperature update: " + temperature);
    }
}
