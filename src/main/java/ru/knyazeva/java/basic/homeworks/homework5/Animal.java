package ru.knyazeva.java.basic.homeworks.homework5;

/*
    Создайте классы Cat, Dog и Horse с наследованием от класса Animal
    У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
    Затраты выносливости:
    Все животные на 1 метр бега тратят 1 ед выносливости,
    Собаки на 1 метр плавания - 2 ед.
    Лошади на 1 метр плавания тратят 4 единицы
    Кот плавать не умеет.
    Реализуйте методы run(Double distance) и swim(Double distance), которые должны возвращать время, затраченное на указанное действие,
    и “понижать выносливость” животного. Если выносливости не хватает, то возвращаем время -1 и указываем что у животного появилось состояние усталости.
    При выполнении действий пишем сообщения в консоль.
    Добавляем метод info(), который выводит в консоль состояние животного.
    */
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

    protected Animal(String name, double stamina, double swimSpeed, double runSpeed) {
        this.name = name;
        this.stamina = stamina;
        this.swimSpeed = swimSpeed;
        this.runSpeed = runSpeed;
    }

    public double run(double distance) {
        System.out.println(name + "бежит");

        this.stamina -= distance * getRunCost();
        if (this.stamina < 0) {
            return -1.0;
        }
        return distance / this.runSpeed;
    }

    public double swim(double distance) {
        System.out.println(name + "плывёт");

        this.stamina -= distance * getSwimCost();
        if (this.stamina < 0) {
            return -1.0;
        }
        return distance / this.runSpeed;
    }

    public void info() {
        System.out.print(name + ": ");
        if (stamina <= 0)
            System.out.print("уставшее");
        else
            System.out.print("выносливость: " + stamina);
        System.out.println();
    }

    public double getRunCost() {
        return 1.0;
    }

    public double getSwimCost() {
        return 0.0;
    }
}