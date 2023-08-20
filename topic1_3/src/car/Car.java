package car;

public class Car {
    private Engine engine;
    private Tire[] tires;

    public Car() {
        engine = new Engine();
        tires = new Tire[4];
        for (int i = 0; i < 4; i++) {
            tires[i] = new Tire(32); // Set initial pressure to 32 psi
        }
    }

    public void start() {
        boolean allTiresOkay = true;
        for (Tire tire : tires) {
            if (tire.getPressure() < 32) {
                allTiresOkay = false;
                break;
            }
        }

        if (allTiresOkay) {
            engine.start();
            System.out.println("Car started.");
        } else {
            System.out.println("Cannot start car. Check tire pressure.");
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
        engine.stop();
        System.out.println("Car stopped.");
    }

    public void restart() {
        if (!engine.isRunning()) {
            engine.start();
            System.out.println("Car restarted.");
        } else {
            System.out.println("Car is already running. Stop before restarting.");
        }
    }
}
