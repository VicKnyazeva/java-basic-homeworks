package ru.knyazeva.java.basic.homeworks.homework10;

import static java.lang.System.*;

public class Application {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("qwe", "123");
        phoneBook.add("qwe", "123");
        phoneBook.add("qwe", "2343");
        phoneBook.add("Qwe", "123");

        out.println(phoneBook);
        out.println(phoneBook.find("qwe"));
        out.println(phoneBook.containsPhoneNumber("234"));
        out.println(phoneBook.containsPhoneNumber("2343"));
        out.println(phoneBook.containsPhoneNumber("123"));
    }
}
