package ru.knyazeva.java.basic.homeworks.homework7;

public class Landrover implements Transport {
    private int fuel;
    public static final int RES_PER_KM = 30;

    public Landrover(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean isDistanceAvailable(int distance) {
        return fuel > distance/RES_PER_KM;
    }

    @Override
    public boolean getAllowedTerrain(int terrain) {
        return true;
    }

    @Override
    public void decreaseResource(int distance) {
        fuel -= distance/RES_PER_KM;
    }

    @Override
    public boolean move(int distance, int terrain) {
        if (isDistanceAvailable(distance)) {
            System.out.println("Вездеход едет");
            decreaseResource(distance);
            return true;
        }
        System.out.println("Для поездки на вездеходе не хватит топлива");
        return false;
    }
}
