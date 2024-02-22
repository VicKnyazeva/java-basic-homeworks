package ru.knyazeva.java.basic.homeworks.homework7;

public class Bicycle implements Movable {
    public static final int RES_PER_KM = 2;

    @Override
    public boolean isTerrainAllowed(Terrain terrain) {
        return terrain == Terrain.DENSE_FOREST || terrain == Terrain.FLAT_LAND;
    }

    @Override
    public int decreaseResource(int distance) {
        return distance / RES_PER_KM;
    }

    @Override
    public boolean isDistanceAvailable(int distance) {
        return true;
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
            System.out.println("Велосипед едет");
            int driverForce = decreaseResource(distance);
            driver.decreaseForce(driverForce);
            return true;
        }
        System.out.println("Для поездки не хватит сил");
        return false;
    }
}
