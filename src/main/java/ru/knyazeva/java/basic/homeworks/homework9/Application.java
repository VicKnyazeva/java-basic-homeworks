package ru.knyazeva.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;


public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = (ArrayList<Integer>) getMinMaxDiapason(1, 0);
        out.println(arrList);

        out.println("Sum of list elements greater than 5: " + sumListElements(arrList));
    }

    public static List<Integer> getMinMaxDiapason(int min, int max) {
        List<Integer> result = new ArrayList<>(max - min + 1);
        if (max > min) {
            for (int i = min; i <= max; i++) {
                result.add(i);
            }
        }
        return result;
    }

    public static int sumListElements(List<Integer> list) {
        int sum = 0;
        for (Integer elem : list) {
            if (elem > 5)
                sum += elem;
        }
        return sum;
    }
}
