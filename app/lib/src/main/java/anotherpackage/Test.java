package anotherpackage;

import com.example.lib.Car;

public class Test {

    public static void main(String[] args) {
        justTesting();
    }

    static void justTesting() {
        Car yellowCar = new Car(70, 2024);
//        System.out.println("Yellow Car Year: " + yellowCar.year);
        yellowCar.setSpeed(1240);

        System.out.println("Yellow Car: " + yellowCar.getSpeed());
    }

}
