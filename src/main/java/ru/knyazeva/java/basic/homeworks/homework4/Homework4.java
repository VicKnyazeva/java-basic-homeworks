package ru.knyazeva.java.basic.homeworks.homework4;

import java.time.Year;

public class Homework4 {
    public static void main(String[] args) {
        User[] arrUsers = new User[10];
        for (int i = 0; i < arrUsers.length; i++) {
            arrUsers[i] = new User("Петров-" + i, "Иван-" + i, "Васильевич-" + i, i + "petrov@mail.ru", 1981 + i);
        }

        int currentYear = Year.now().getValue();
        for (User arrUser : arrUsers) {
            if (currentYear - arrUser.getYear() > 40) {
                arrUser.printUserInfo();
                System.out.println();
            }
        }

        Box box = new Box("green", 10, 20, 30, true);
        box.printBoxInfo();
        box.setColor("blue");
        box.printBoxInfo();
        box.open();
        box.putObject();
        box.close();
        box.removeObject();
        box.open();
        box.removeObject();
        box.close();
        box.putObject();
    }
}
