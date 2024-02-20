package ru.knyazeva.java.basic.homeworks.homework7;

public class Horse implements Movable {
    private int force;
    public static final int RES_PER_KM = 2;

    public Horse(int force) {
        this.force = force;
    }

    @Override
    public boolean isDistanceAvailable(int distance) {
        return force > distance / RES_PER_KM;
    }

    @Override
    public boolean isTerrainAllowed(Terrain terrain) {
        return terrain == Terrain.Dense_Forest || terrain == Terrain.Flat_Land;
    }

    @Override
    public int decreaseResource(int distance) {
        force -= distance / RES_PER_KM;
        return 0;
    }

    @Override
    public boolean move(int distance, Terrain terrain, Driver driver) {
        if (driver == null) {
            System.out.println("Поездка без наездника невозможна");
            return false;
        }
        if (!isTerrainAllowed(terrain)) {
            System.out.println("Поездка по этой местности невозможна");
            return false;
        }
        if (isDistanceAvailable(distance)) {
            System.out.println("Лошадь скачет");
            int driverForce = decreaseResource(distance);
            driver.decreaseForce(driverForce);
            return true;
        }
        System.out.println("Для поездки лошади не хватит сил");
        return false;
    }
}
