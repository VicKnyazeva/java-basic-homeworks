package ru.knyazeva.java.basic.homeworks.homework11;

import java.util.ArrayList;
import java.util.Comparator;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int value = (int) (Math.random() * i * 10);
            list.add(value);
        }

        list.sort(Comparator.naturalOrder());

        System.out.println(list);

        var root = Node.sortedListToBST(list);

        System.out.println(" 2 -> " + root.find(2));
        System.out.println(" 5 -> " + root.find(5));
        System.out.println("-1 -> " + root.find(-1));
        System.out.println(" 9 -> " + root.find(9));

        var list1 = root.getSortedList();
        System.out.println(list1);
    }
}
