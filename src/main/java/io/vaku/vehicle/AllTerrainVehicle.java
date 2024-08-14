package io.vaku.vehicle;

import io.vaku.TerrainType;

public class AllTerrainVehicle implements Vehicle {

    private int fuel;

    public AllTerrainVehicle(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        if (fuel - distance >= 0) {
            fuel -= distance;
            System.out.println("Вездеход преодолел " + distance + "м по местности " + terrainType);
            return true;
        }

        System.out.println("Вездеходу не хватило топлива преодолеть " + distance + "м по местности " + terrainType);
        return false;
    }
}
