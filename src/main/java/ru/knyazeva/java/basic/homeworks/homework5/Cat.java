package ru.knyazeva.java.basic.homeworks.homework5;

public class Cat extends Animal {
    public Cat(String name, double stamina, double runSpeed) {
        super(name, stamina, 0.0, runSpeed);
    }

    @Override
    public double swim(double distance) {
        System.out.println(getName() + "не плавает");
        return -1.0;
    }
}
