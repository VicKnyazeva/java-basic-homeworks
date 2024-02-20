package ru.knyazeva.java.basic.homeworks.homework7;

public class Car implements Movable {
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
        return fuel > distance / RES_PER_KM;
    }

    @Override
    public int decreaseResource(int distance) {
        fuel -= distance / RES_PER_KM;
        return 0;
    }

    @Override
    public boolean isTerrainAllowed(Terrain terrain) {
        return terrain == Terrain.Flat_Land;
    }

    @Override
    public boolean move(int distance, Terrain terrain, Driver driver) {
        if (driver == null) {
            System.out.println("Поездка без водителя невозможна");
            return false;
        }
        if (!isTerrainAllowed(terrain)) {
            System.out.println("Поездка по этой местности невозможна");
            return false;
        }
        if (isDistanceAvailable(distance)) {
            System.out.println("Машина едет");
            int driverForce = decreaseResource(distance);
            driver.decreaseForce(driverForce);
            return true;
        }
        System.out.println("Для поездки на машине не хватит топлива");
        return false;
    }
}
