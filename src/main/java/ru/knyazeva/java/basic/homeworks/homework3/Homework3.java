package ru.knyazeva.java.basic.homeworks.homework3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {

        System.out.println("Task-1:");
        int[][] array = new int[4][4];
        fillArrayRandom(array, -5, 10);
        printArray(array);
        System.out.println("Sum of positive numbers: " + sumOfPositiveElements(array));

        System.out.println("\nTask-2:");
        printSquare(5);

        System.out.println("\nTask-3:");
        int[][] array1 = new int[6][6];
        fillArrayRandom(array1, 1, 9);
        System.out.println("Initial:");
        printArray(array1);
        diagonalsToZero(array1);
        System.out.println("With zero diagonals:");
        printArray(array1);

        System.out.println("\nTask-4:");
        int[][] array2 = new int[3][3];
        fillArrayRandom(array2, -100, 100);
        printArray(array2);
        System.out.println("Max value: " + findMax(array2));

        System.out.println("\nTask-5:\n");
        System.out.println("With second string");
        int[][] array3 = new int[2][5];
        fillArrayRandom(array3, -10, 10);
        printArray(array3);
        System.out.println("Sum of elements of second string: " + sumElementsOfSecondString(array3));

        System.out.println("\nWithout second string");
        int[][] array4 = new int[1][5];
        fillArrayRandom(array4, -10, 10);
        printArray(array4);
        System.out.println("Sum of elements of second string: " + sumElementsOfSecondString(array4));
    }

    public static int sumElementsOfSecondString(int[][] array) {
        if (array.length > 1) {
            int sum = 0;

            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
            }
            return sum;
        } else
            return -1;
    }

    public static int findMax(int[][] array) {
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue)
                    maxValue = array[i][j];
            }
        }
        return maxValue;
    }

    public static void diagonalsToZero(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == j) || (i + j == array.length - 1))
                    array[i][j] = 0;
            }
        }
    }

    public static void printSquare(int size) {
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0)
                    sum += array[i][j];
            }
        }
        return sum;
    }

    public static void fillArrayRandom(int[][] array, long min, long max) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) randomGenerator(min, max);
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static long randomGenerator(long min, long max) {
        max -= min;
        final double random = Math.random();
        return Math.round((random * max) + min);
    }
}
