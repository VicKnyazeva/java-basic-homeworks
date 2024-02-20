package ru.knyazeva.java.basic.homeworks.homework7;

public enum Terrain {
    Dense_Forest(1), Flat_Land(2), Swamp(3);

    private int terrain;

    Terrain(int terrain) {
        this.terrain = terrain;
    }

    public int getValue() {
        return terrain;
    }
}
