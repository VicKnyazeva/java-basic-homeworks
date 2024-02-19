package ru.knyazeva.java.basic.homeworks.homework7;

public interface Transport {
    boolean move(int distance, int terrain);
    boolean getAllowedTerrain(int terrain);
    void decreaseResource(int distance);
    boolean isDistanceAvailable(int distance);
}
