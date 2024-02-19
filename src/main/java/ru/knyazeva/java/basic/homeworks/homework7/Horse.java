package ru.knyazeva.java.basic.homeworks.homework7;

public class Horse implements Transport {
    private int force;
    public static final int RES_PER_KM = 2;

    public Horse(int force) {
        this.force = force;
    }

    @Override
    public boolean isDistanceAvailable(int distance) {
        return force > distance/RES_PER_KM;
    }

    @Override
    public boolean getAllowedTerrain(int terrain) {
        return terrain == 1 || terrain == 2;
    }

    @Override
    public void decreaseResource(int distance) {
        force-= distance/RES_PER_KM;
    }

    @Override
    public boolean move(int distance, int terrain) {
        if (getAllowedTerrain(terrain) && isDistanceAvailable(distance)) {
            System.out.println("Лошадь скачет");
            decreaseResource(distance);
            return true;
        }
        System.out.println("Для поездки лошади не хватит сил");
        return false;
    }
}
