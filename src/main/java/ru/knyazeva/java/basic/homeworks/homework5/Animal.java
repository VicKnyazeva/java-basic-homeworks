package ru.knyazeva.java.basic.homeworks.homework5;

public class Animal {
    private String name;
    private double stamina;
    private double swimSpeed;
    private double runSpeed;

    public double getStamina() {
        return stamina;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public double getRunSpeed() {
        return runSpeed;
    }

    public String getName() {
        return name;
    }

    protected Animal(String name, double stamina, double runSpeed, double swimSpeed) {
        this.name = name;
        this.stamina = stamina;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
    }

    public double run(double distance) {
        stamina -= distance * getRunCost();
        if (stamina < 0) {
            System.out.printf("%s сделал попытку пробежать дистанцию. Для бега на %.2f м не хватает выносливости. Выносливость после попытки: %.0f у.е\n",
                    name, distance, stamina);
            return -1.0;
        }
        System.out.println(name + " бежит со скоростью " + runSpeed + " м/с");

        return distance / runSpeed;
    }

    public double swim(double distance) {
        stamina -= distance * getSwimCost();
        if (stamina < 0) {
            System.out.printf("%s сделал попытку проплыть дистанцию. Для плавания на %.2f м не хватает выносливости. Выносливость после попытки: %.0f у.е\n",
                    name, distance, stamina);
            return -1.0;
        }
        System.out.println(name + " плывёт со скоростью " + swimSpeed + " м/с");

        return distance / swimSpeed;
    }

    public void info() {
        System.out.print(name + ": ");
        if (stamina <= 0)
            System.out.print("состояние уставшее");
        else
            System.out.print("выносливость " + stamina + " у.е.");
        System.out.println();
    }

    public void fullInfo(double animalTime, double distance) {
        if (animalTime <= 0)
            System.out.printf("%s не смог преоделеть дистанцию\n", name);
        else
            System.out.printf("%s преодолел дистанцию в %.2f м за %.2f сек.\n", name, distance, animalTime);
    }

    public double getRunCost() {
        return 1.0;
    }

    public double getSwimCost() {
        return 0.0;
    }
}