package ru.knyazeva.java.basic.homeworks.homework8;

public class AppArraySizeException extends Exception {
    public AppArraySizeException(int rows) {
        super("Ожидался квадратный массив размером 4x4: кол-во рядов = " + rows);
    }
    public AppArraySizeException(int row, int columns) {
        super("Ожидался квадратный массив размером 4x4: ряд " + row + " кол-во колонок = " + columns);
    }

}
