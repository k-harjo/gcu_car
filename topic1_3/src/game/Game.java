package game;

import racecars.RaceCar;

public class Game {
    public static void main(String[] args) {
    	RaceCar racecar = new RaceCar();

    	racecar.start();
    	racecar.run(50);
    	racecar.stop();
    	racecar.restart();
    }
}
