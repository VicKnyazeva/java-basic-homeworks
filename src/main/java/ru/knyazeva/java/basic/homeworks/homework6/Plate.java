package ru.knyazeva.java.basic.homeworks.homework6;

public class Plate {
    private int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this(maxFood,maxFood);
    }

    public Plate(int maxFood, int currentFood) {
        this.maxFood = maxFood;
        this.currentFood = currentFood;
    }

    public int getMaxFood() {
        return maxFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public void addFood(int newFood) {
        if (currentFood + newFood > maxFood)
            System.out.println("В тарелку не лезет столько новой еды: " + newFood);
        else {
            currentFood += newFood;
            System.out.println("В тарелку добавлено новой еды: " + newFood);
        }
    }

    public boolean decreaseFood(int foodAmount) {
        currentFood -= foodAmount;
        if (currentFood >= 0)
            return true;
        else
            return false;
    }

    public void getInfo() {
        System.out.println("Сейчас в тарелке еды: " + currentFood + " из " + maxFood + " возможных");
    }
}
