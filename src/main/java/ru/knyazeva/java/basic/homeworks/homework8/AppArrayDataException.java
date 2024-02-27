package ru.knyazeva.java.basic.homeworks.homework8;

public class AppArrayDataException extends Exception {
    public AppArrayDataException(int row, int column) {
        super("В ячейке [" + row + "," + column + "] ожидалось целое число");
    }
}
