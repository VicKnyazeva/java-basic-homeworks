package ru.knyazeva.java.basic.homeworks.homework1;
public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Метод 1");
        System.out.println("-------");
        greetings();
        System.out.println();

        System.out.println("Метод 2");
        System.out.println("-------");
        checkSign(1,2,-3);
        System.out.println();

        System.out.println("Метод 3");
        System.out.println("-------");
        selectColor();
        System.out.println();

        System.out.println("Метод 4");
        System.out.println("-------");
        compareNumbers();
        System.out.println();

        System.out.println("Метод 5");
        System.out.println("-------");
        addOrSubtractAndPrint(-1, 1, false);
        System.out.println();
    }

    /* Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java; */
    public static void greetings() {
        System.out.println("Hello, ");
        System.out.println("World, ");
        System.out.println("from, ");
        System.out.println("Java;");
    }

    /* Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
       Метод должен посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
       в противном случае - “Сумма отрицательная” */
    public static void checkSign(int a, int b, int c) {
        String result = (a + b + c) >= 0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(result);
    }

    /* Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
       Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”,
       если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый” */
    public static void selectColor() {
        int data = 42;

        if(data <= 10)
            System.out.println("Красный");
        else if (data > 10 && data <= 20)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    /* Реализуйте метод compareNumbers(), в теле которого объявите
       две int переменные a и b с любыми начальными значениями.
       Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”; */
    public static void compareNumbers() {
        int a = 13;
        int b = 13;

        String result = (a >= b) ? "a >= b" : "a < b";
        System.out.println(result);
    }

    /* Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
       Если increment = true, то метод должен к initValue прибавить delta и отпечатать в консоль результат,
       в противном случае - вычесть */
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if(increment)
            initValue += delta;
        else
            initValue -= delta;

        System.out.println(initValue);
    }
}
