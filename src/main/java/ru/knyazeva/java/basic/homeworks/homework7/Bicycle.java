package ru.knyazeva.java.basic.homeworks.homework7;

public class Bicycle implements Transport {

    @Override
    public boolean getAllowedTerrain(int terrain) {
        return terrain == 1 || terrain == 2;
    }

    @Override
    public void decreaseResource(int distance) {

    }

    @Override
    public boolean isDistanceAvailable(int distance) {
        return true;
    }

    @Override
    public boolean move(int distance, int terrain) {
        if (getAllowedTerrain(terrain)) {
            System.out.println("Велосипед едет");
            //decreaseResource(distance);
            return true;
        }
        //System.out.println("Для поездки лошади не хватит сил");
        return false;
    }

}
