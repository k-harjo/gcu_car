package racecars;

import car.Engine;
import car.Tire;

public class RaceCar {
    private Engine engine;
    private Tire[] tires;

    public RaceCar() {
        engine = new Engine();
        tires = new Tire[4];
        for (int i = 0; i < 4; i++) {
            tires[i] = new Tire(32); // Set initial pressure to 32 psi
        }
    }


    public void start() {
        boolean allTiresInflated = true;
        for (Tire tire : tires) {
            if (tire.getPressure() < 32) {
                allTiresInflated = false;
                break;
            }
        }

        if (allTiresInflated) {
            engine.start();
            System.out.println("Car started.");
        } else {
            System.out.println("Cannot start car. Not all tires have sufficient pressure.");
        }
    }

    public void run(int speed) {
        if (engine.isRunning()) {
            System.out.println("Car is running at " + speed + " mph.");
        } else {
            System.out.println("Car is not running. Start the engine first.");
        }
    }

    public void stop() {
        if (engine.isRunning()) {
            engine.stop();
            System.out.println("Car stopped.");
        } else {
            System.out.println("Car is not running.");
        }
    }

    public void restart() {
        if (!engine.isRunning()) {
            engine.start();
            System.out.println("Car restarted.");
        } else {
            System.out.println("Car is already running. Stop the engine first.");
        }
    }
}