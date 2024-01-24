package ru.knyazeva.java.basic.homeworks.homework2;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {

        //Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз
        //printString(5, "Hello");

        //Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
        int[] arr = {1, 2, 6, 5, 7, 0, 8, 9};
        //sumArrayElements(arr);

        // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
        // метод должен заполниться каждую ячейку массива указанным числом.
        int[] arr1 = new int[10];
        //fillArray(5, arr1);
        //System.out.printlnArrays.toString(arr1));

        // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
        // увеличивающий каждый элемент которого на указанное число.
        int[] arr2 = new int[10];
        //fillArray(42, arr2);
        //increaseArrayElements(3, arr2);

        // Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
        // и печатающий в консоль сумма элементов какой из половин массива больше.
        int[] arr3 = {1, 2, 1, 1, 1};
        System.out.println(Arrays.toString(arr3));
        printGreaterPart(arr3);
    }

    // Реализуйте метод, принимающий в качестве аргументов целое число и строку,
    // и печатающий в консоль строку указанное количество раз
    public static void printString(int i, String str) {
        for (int k = 0; k < i; k++) {
            System.out.println(str);
        }
    }

    // Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы,
    // значение которых больше 5, и печатающий полученную сумму в консоль.
    public static void sumArrayElements(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 5)
                sum += arr[i];
        }
        System.out.println(sum);
    }

    // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    // метод должен заполниться каждую ячейку массива указанным числом.
    public  static void fillArray(int m, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = m;
        }
    }

    // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    // увеличивающий каждый элемент которого на указанное число.
    public static void increaseArrayElements(int m, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += m;
        }
    }

    // Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    // и печатающий в консоль сумма элементов какой из половин массива больше.
    private static void printGreaterPart(int[] arr) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.length/2; i++) {
            sumLeft += arr[i];
        }
        for (int i = arr.length/2; i < arr.length; i++) {
            sumRight += arr[i];
        }
        if(sumLeft > sumRight)
            System.out.println("Сумма элементов из левой части массива больше: " + sumLeft);
        else if (sumLeft == sumRight)
            System.out.println("Суммы элементов из обеих частей массива равны.");
        else
            System.out.println("Сумма элементов из правой части массива больше: " + sumRight);
    }
}
