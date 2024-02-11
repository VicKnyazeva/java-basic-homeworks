package ru.knyazeva.java.basic.homeworks.homework4;

public class User {
    private String surname;
    private String firstname;
    private String patronymic;
    private String email;
    private int year;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public User(String surname, String firstname, String patronymic, String email, int year) {
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.email = email;
        this.year = year;
    }

    public void printUserInfo() {
        System.out.printf("ФИО: %s %s %s\nГод рождения: %d\ne-mail: %s%n", surname, firstname, patronymic, year, email);
    }
}
