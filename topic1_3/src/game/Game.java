package game;

import car.Car;

public class Game {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.run(50);
        car.stop();
        car.restart();
    }
}
