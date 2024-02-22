package ru.knyazeva.java.basic.homeworks.homework7;

public class Landrover implements Movable {
    private int fuel;
    public static final int RES_PER_KM = 30;

    public Landrover(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean isDistanceAvailable(int distance) {
        return fuel > distance / RES_PER_KM;
    }

    @Override
    public boolean isTerrainAllowed(Terrain terrain) {
        return true;
    }

    @Override
    public int decreaseResource(int distance) {
        fuel -= distance / RES_PER_KM;
        return 0;
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
            System.out.println("Вездеход едет");
            int driverForce = decreaseResource(distance);
            driver.decreaseForce(driverForce);
            return true;
        }
        System.out.println("Для поездки на вездеходе не хватит топлива");
        return false;
    }
}
