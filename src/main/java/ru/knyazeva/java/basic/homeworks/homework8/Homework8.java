package ru.knyazeva.java.basic.homeworks.homework8;

public class Homework8 {
    public static void main(String[] args) {

        String[][] twoDimArray = {{"5", "7", "3", "17" }, {"7", "0", "1", "12" }, {"8", "1", "2", "3" }, {"8", "1", "2", "0" }};
        try {
            int r = sumArrayElements(twoDimArray);
            System.out.println("сумма = " + r);
        } catch (AppArraySizeException ex) {
            System.out.println("Исключение 1: " + ex.getMessage());
        } catch (AppArrayDataException ex) {
            System.out.println("Исключение 2: " + ex.getMessage());
        }
    }

    private static int sumArrayElements(String[][] array) throws AppArrayDataException, AppArraySizeException {
        if (array.length != 4) {
            throw new AppArraySizeException(array.length);
        }

        int result = 0;
        for (int row = 0; row < array.length; row++) {
            if (array[row].length != 4) {
                throw new AppArraySizeException(row, array[row].length);
            }
            result += sumElements(row, array[row]);
        }

        return result;
    }

    private static int sumElements(int row, String[] array) throws AppArrayDataException {
        int result = 0;
        for (int column = 0; column < array.length; column++) {
            try {
                result += Integer.parseInt(array[column]);
            } catch (NumberFormatException ex) {
                throw new AppArrayDataException(row, column);
            }
        }
        return result;
    }
}
