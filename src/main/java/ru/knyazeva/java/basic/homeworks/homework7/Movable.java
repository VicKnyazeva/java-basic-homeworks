package ru.knyazeva.java.basic.homeworks.homework7;

public interface Movable {
    boolean move(int distance, Terrain terrain, Driver driver);

    boolean isTerrainAllowed(Terrain terrain);

    int decreaseResource(int distance);

    boolean isDistanceAvailable(int distance);
}
