package ru.knyazeva.java.basic.homeworks.homework7;

public class Homework7 {
    public static void main(String[] args) {
        Man man = new Man("Joe Doe", 50);
        man.outStats();

        Car car = new Car(50);
        man.takeTransport(car);
        man.move(400, Terrain.Flat_Land);
        System.out.println(car.getFuel());
        man.freeTransport();

        man.outStats();
        man.move(10, Terrain.Dense_Forest);
        man.outStats();
        man.takeTransport(new Bicycle());
        man.move(50, Terrain.Dense_Forest);
        man.outStats();
    }
}
