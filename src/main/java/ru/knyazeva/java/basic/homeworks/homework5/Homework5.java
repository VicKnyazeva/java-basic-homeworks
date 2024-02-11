package ru.knyazeva.java.basic.homeworks.homework5;

public class Homework5 {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 10, 10, 6);
        dog.info();
        double dogTime1 = dog.run(5);
        dog.fullInfo(dogTime1, 5);
        dog.info();
        System.out.println();
        double dogTime2 = dog.swim(1);
        dog.fullInfo(dogTime2, 1);
        dog.info();
        dog.run(10);


        System.out.println();
        Cat cat = new Cat("Барсик", 10, 7);
        cat.info();
        double catTime = cat.run(9);
        cat.fullInfo(catTime, 9);
        cat.info();
        cat.swim(1);
        cat.run(1);

        System.out.println();
        Horse horse = new Horse("Ветерок", 600, 40, 20);
        horse.info();
        horse.run(100);
        horse.info();
        double horseTime = horse.swim(135);
        horse.fullInfo(horseTime, 135);
    }
}
