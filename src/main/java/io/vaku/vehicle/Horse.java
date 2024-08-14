package io.vaku.vehicle;

import io.vaku.TerrainType;

public class Horse implements Vehicle {

    private int power;

    public Horse(int power) {
        this.power = power;
    }

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        switch (terrainType) {
            case DENSE_FOREST, PLAIN -> {
                if (power - distance >= 0) {
                    power -= distance;
                    System.out.println("Лошадь преодолела " + distance + "м по местности " + terrainType);
                    return true;
                }

                System.out.println("Лошади не хватило сил преодолеть " + distance + "м по местности " + terrainType);
                return false;
            }
            default -> System.out.println("Лошадь не может проехать по этому типу местности: " + terrainType);
        }

        return false;
    }
}
