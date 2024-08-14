package io.vaku.vehicle;

import io.vaku.TerrainType;

public class Bicycle implements Vehicle {

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        switch (terrainType) {
            case DENSE_FOREST, PLAIN -> {
                System.out.println("Вы преодолели на велосипеде " + distance + "м по местности " + terrainType);
                return true;
            }
            default -> System.out.println("Велосипед не может проехать по этому типу местности: " + terrainType);
        }

        return false;
    }
}
