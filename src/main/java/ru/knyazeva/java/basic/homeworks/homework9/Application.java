package ru.knyazeva.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;


public class Application {
    public static void main(String[] args) {
        try {
            List<Integer> arrList = getMinMaxDiapason(1, 6);
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
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
    }

    public static List<Integer> getMinMaxDiapason(int min, int max) throws CustomListException {
        if (max < min)
            throw new CustomListException("Max value can not be less than Min value");

        List<Integer> result = new ArrayList<>(max - min + 1);
        for (int i = min; i <= max; i++) {
            result.add(i);
        }
        return result;
    }

    public static int sumListElements(List<Integer> list) {
        int sum = 0;
        if (list != null) {
            for (Integer elem : list) {
                if (elem > 5)
                    sum += elem;
            }
        }
        return sum;
    }

    public static void overwriteListElements(int num, List<Integer> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, num);
            }
        }
    }

    public static void increaseListElements(int num, List<Integer> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                int element = list.get(i);
                list.set(i, element + num);
            }
        }
    }

    public static List<String> getEmployeesNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        if (employees != null) {
            for (Employee e : employees) {
                names.add(e.getName());
            }
        }
        return names;
    }

    public static List<Employee> getGreaterThanMinAgeEmployees(List<Employee> employees, int minAge) {
        List<Employee> result = new ArrayList<>();
        if (employees != null) {
            for (Employee e : employees) {
                if (e.getAge() >= minAge)
                    result.add(e);
            }
        }
        return result;
    }

    public static boolean isMiddleAge(List<Employee> employees, int minMiddleAge) throws CustomListException {
        if (employees == null || employees.isEmpty())
            throw new CustomListException("List parameter can not be null or empty");

        int midAge = 0;
        for (Employee e : employees) {
            midAge += e.getAge();
        }
        midAge /= employees.size();
        return midAge > minMiddleAge;
    }

    public static Employee getMinAgeEmployee(List<Employee> employees) {
        Employee employee = null;
        if (employees != null) {
            for (Employee e : employees) {
                if (employee == null || (e.getAge() < employee.getAge()))
                    employee = e;
            }
        }
        return employee;
    }
}
