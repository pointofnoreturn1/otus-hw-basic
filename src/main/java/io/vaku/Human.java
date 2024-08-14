package io.vaku;

import io.vaku.vehicle.Vehicle;

public class Human {

    private String name;
    private Vehicle currentVehicle;

    public Human(String name, Vehicle currentVehicle) {
        this.name = name;
        this.currentVehicle = currentVehicle;
    }

    public void setCurrentVehicle(Vehicle vehicle) {
        currentVehicle = vehicle;
    }

    public void getOutOfVehicle() {
        currentVehicle = null;
    }

    public boolean move(int distance, TerrainType terrainType) {
        if (currentVehicle == null) {
            System.out.println("Человек прошел пешком " + distance + "м по местности " + terrainType);
            return true;
        }

        return currentVehicle.move(distance, terrainType);
    }
}
