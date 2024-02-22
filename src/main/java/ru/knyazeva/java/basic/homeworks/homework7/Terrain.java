package ru.knyazeva.java.basic.homeworks.homework7;

public enum Terrain {
    DENSE_FOREST(1), FLAT_LAND(2), SWAMP(3);

    private int terrain;

    Terrain(int terrain) {
        this.terrain = terrain;
    }

}
