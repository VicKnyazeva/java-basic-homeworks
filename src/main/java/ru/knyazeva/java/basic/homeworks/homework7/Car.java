package ru.knyazeva.java.basic.homeworks.homework7;

public class Car implements Transport {
    private int fuel;
    public static final int RES_PER_KM = 10;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public boolean isDistanceAvailable(int distance) {
        return fuel > distance/RES_PER_KM;
    }

    @Override
    public void decreaseResource(int distance) {
        fuel -= distance/RES_PER_KM;
    }

    @Override
    public boolean getAllowedTerrain(int terrain) {
        return terrain == 2;
    }

    @Override
    public boolean move(int distance, int terrain) {
        if(getAllowedTerrain(terrain) && isDistanceAvailable(distance)) {
            System.out.println("Машина едет");
            decreaseResource(distance);
            return true;
        }
        System.out.println("Для поездки на машине не хватит топлива");
        return false;
    }
}
