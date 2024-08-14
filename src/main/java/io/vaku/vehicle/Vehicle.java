package io.vaku.vehicle;

import io.vaku.TerrainType;

public interface Vehicle {

    boolean move(int distance, TerrainType terrainType);
}
