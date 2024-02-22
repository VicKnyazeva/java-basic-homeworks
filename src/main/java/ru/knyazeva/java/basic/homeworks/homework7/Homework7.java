package ru.knyazeva.java.basic.homeworks.homework7;

public class Homework7 {
    public static void main(String[] args) {
        Man man = new Man("John Doe", 50);
        man.printStats();

        Car car = new Car(50);
        car.move(400, Terrain.FLAT_LAND, null);
        man.takeTransport(car);
        man.move(400, Terrain.FLAT_LAND);
        man.takeTransport(new Horse(100));
        man.move(200, Terrain.FLAT_LAND);
        System.out.println(car.getFuel());
        man.freeTransport();
        man.printStats();

        man.move(10, Terrain.SWAMP);
        man.printStats();

        man.takeTransport(new Bicycle());
        man.move(50, Terrain.DENSE_FOREST);
        man.printStats();
    }
}
