package ru.knyazeva.java.basic.homeworks.homework7;

public class Homework7 {
    public static void main(String[] args) {

        Car car = new Car(50);
        Man man = new Man("hgh", car);
        man.move(car, 400, 2);
        System.out.println(car.getFuel());
        man.move(null, 10, 1);

        //car.move(550, 2);

    }
}
