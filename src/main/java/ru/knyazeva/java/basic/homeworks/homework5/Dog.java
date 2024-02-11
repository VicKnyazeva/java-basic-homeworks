package ru.knyazeva.java.basic.homeworks.homework5;

public class Dog extends Animal {
    public Dog(String name, double stamina, double runSpeed, double swimSpeed) {
        super(name, stamina, runSpeed, swimSpeed);
    }

    @Override
    public double getSwimCost() {
        return 2.0;
    }
}
