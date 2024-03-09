package ru.knyazeva.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;


public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = getMinMaxDiapason(1, 5);
        out.println(arrList);

        out.println("Sum of list elements greater than 5: " + sumListElements(arrList));

        overwriteListElements(153, arrList);
        out.println(arrList);

        increaseListElements(5, arrList);
        out.println(arrList);

        ArrayList<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee("Ivan", 35));
        employeesList.add(new Employee("Nikita", 21));
        employeesList.add(new Employee("Olga", 33));
        employeesList.add(new Employee("Oleg", 36));
        out.println(getEmployeesNames(employeesList));
        out.println(getGreaterThanMinAgeEmployees(employeesList, 33));
        out.println(getMinAgeEmployee(employeesList));
        out.println(isMiddleAge(employeesList, 29));
    }

    public static ArrayList<Integer> getMinMaxDiapason(int min, int max) {
        ArrayList<Integer> result = new ArrayList<>(max - min + 1);
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

    public static void overwriteListElements(int num, List<Integer> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, Integer.valueOf(num));
            }
        }
    }

    public static void increaseListElements(int num, List<Integer> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                int element = list.get(i);
                list.set(i, Integer.valueOf(element + num));
            }
        }
    }

    public static ArrayList<String> getEmployeesNames(List<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (Employee e : employees) {
            names.add(e.getName());
        }
        return names;
    }

    public static ArrayList<Employee> getGreaterThanMinAgeEmployees(List<Employee> employees, int minAge) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getAge() >= minAge)
                result.add(e);
        }
        return result;
    }

    public static boolean isMiddleAge(List<Employee> employees, int minMiddleAge) {
        int midAge = 0;
        for (Employee e : employees) {
            midAge += e.getAge();
        }
        midAge /= employees.size();
        return midAge > minMiddleAge;
    }

    public static Employee getMinAgeEmployee(List<Employee> employees) {
        int minAge = Integer.MAX_VALUE;
        Employee employee = null;

        for (Employee e : employees) {
            int currentAge = e.getAge();
            if (currentAge < minAge) {
                minAge = currentAge;
                employee = e;
            }
        }
        return employee;
    }
}
