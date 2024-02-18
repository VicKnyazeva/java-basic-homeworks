package ru.knyazeva.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private boolean satiety;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        if (!satiety) {
            if (appetite <= plate.getCurrentFood()) {
                plate.decreaseFood(appetite);
                satiety = true;
                System.out.println("Кот " + name + " поел");
            }
            else
                System.out.println("Коту " + name + " мало еды");
        }
        else
            System.out.println("Кот " + name + " не голоден");
    }

    public void getInfo() {
        String catSatiety = satiety ? "сытый" : "голодный";
        System.out.println("Кот " + name + " " + catSatiety + "; аппетит: " + appetite);
    }
}
