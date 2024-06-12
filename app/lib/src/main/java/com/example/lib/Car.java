package com.example.lib;

public class Car {
    // states
    private int year;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // methods
    void accelerate() {
        speed += 10;
        System.out.println("Your new speed is: " + speed);
    }

    public void brake() {
        speed -= 5;
        System.out.println("Your new speed is: " + speed);
    }

    // Constructor
    public Car(int carSpeed, int carYear) {
        year = carYear;
        speed = carSpeed;
    }
}
