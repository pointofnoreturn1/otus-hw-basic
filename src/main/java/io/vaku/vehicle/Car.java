package io.vaku.vehicle;

import io.vaku.TerrainType;

public class Car implements Vehicle {

    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        if (terrainType == TerrainType.PLAIN) {
            if (fuel - distance >= 0) {
                fuel -= distance;
                System.out.println("Машина преодолела " + distance + "м по местности " + terrainType);
                return true;
            }

            System.out.println("Машине не хватило топлива преодолеть " + distance + "м по местности " + terrainType);
            return false;
        }

        System.out.println("Машина не может проехать по этому типу местности: " + terrainType);
        return false;
    }
}
