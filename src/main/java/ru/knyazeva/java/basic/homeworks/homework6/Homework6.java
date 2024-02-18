package ru.knyazeva.java.basic.homeworks.homework6;

public class Homework6 {
    public static void main(String[] args) {
        testCats();
        testCat();
    }

    private static void testCats() {
        Plate plate = new Plate(170);

        Cat[] cats = {
                new Cat("Пушок", 60),
                new Cat("Мурзик", 50),
                new Cat("Барсик", 70)
        };

        for(Cat cat : cats) {
            cat.eat(plate);
            cat.getInfo();
        }

        System.out.println();
    }

    private static void testCat() {
        Cat cat1 = new Cat("Тимоша", 60);
        cat1.getInfo();
        Plate plate = new Plate(100);
        plate.getInfo();
        cat1.eat(plate);
        cat1.getSatiety();
        plate.getInfo();
        cat1.getInfo();
        cat1.setSatiety(false);
        cat1.getInfo();
        cat1.eat(plate);
        plate.addFood(20);
        cat1.eat(plate);
        plate.getInfo();

        System.out.println();
    }
}
