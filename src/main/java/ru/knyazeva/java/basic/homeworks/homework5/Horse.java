package ru.knyazeva.java.basic.homeworks.homework5;

public class Horse extends Animal {
    public Horse(String name, double stamina, double runSpeed, double swimSpeed) {
        super(name, stamina, runSpeed, swimSpeed);
    }

    @Override
    public double getSwimCost() {
        return 4.0;
    }
}
