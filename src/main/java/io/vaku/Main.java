package io.vaku;

import io.vaku.vehicle.Car;
import io.vaku.vehicle.Horse;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(100);
        Human human = new Human("John", car);
        human.move(50, TerrainType.PLAIN);
        human.move(51, TerrainType.PLAIN);

        Horse horse = new Horse(50);
        human.setCurrentVehicle(horse);
        human.move(15, TerrainType.DENSE_FOREST);
        human.move(10, TerrainType.SWAMP);

        human.getOutOfVehicle();
        human.move(20, TerrainType.SWAMP);
    }
}
