package lib;

public class Vehicle {

    int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    void start() {
        System.out.println("The vehicle starts");
    }

    void stop() {
        System.out.println("The vehicle stops");
    }
}
