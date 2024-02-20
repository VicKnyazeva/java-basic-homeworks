package ru.knyazeva.java.basic.homeworks.homework7;

public class Homework7 {
    public static void main(String[] args) {
        Man man = new Man("John Doe", 50);
        man.printStats();

        Car car = new Car(50);
        car.move(400, Terrain.Flat_Land, null);
        man.takeTransport(car);
        man.move(400, Terrain.Flat_Land);
        man.takeTransport(new Horse(100));
        man.move(200, Terrain.Flat_Land);
        System.out.println(car.getFuel());
        man.freeTransport();
        man.printStats();

        man.move(10, Terrain.Swamp);
        man.printStats();

        man.takeTransport(new Bicycle());
        man.move(50, Terrain.Dense_Forest);
        man.printStats();
    }
}
