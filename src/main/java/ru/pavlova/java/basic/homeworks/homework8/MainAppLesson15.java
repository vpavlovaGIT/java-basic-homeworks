package ru.pavlova.java.basic.homeworks.homework8;

import java.util.ArrayList;
import java.util.List;

import static ru.pavlova.java.basic.homeworks.homework8.EmployeeArrList.*;

public class MainAppLesson15 {
    public static void main(String[] args) {
        ArrayList<Integer> range = generateRange(1, 10);
        System.out.println("Список из диапазона: " + range);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(5);
        System.out.println("Сумма больших чисел: " + sumGreaterThan5(numbers));

        ArrayList<Integer> listToRewrite = new ArrayList<>();
        listToRewrite.add(3);
        listToRewrite.add(null);
        listToRewrite.add(2);
        rewriteListWithNumber(5, listToRewrite);
        System.out.println("Переписанный список: " + listToRewrite);

        ArrayList<Integer> listToIncrease = new ArrayList<>();
        listToIncrease.add(1);
        listToIncrease.add(3);
        listToIncrease.add(5);
        increaseListByNumber(2, listToIncrease);
        System.out.println("Увеличенный список: " + listToIncrease);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иван", 25));
        employees.add(new Employee(" Наталья", 23));
        employees.add(new Employee("Елена", 30));
        employees.add(new Employee("Сергей", 59));
        System.out.println("Имена сотрудников: " + getEmployeeNames(employees));

        List<Employee> olderEmployees = getEmployeesOlderThan(employees, 25);
        System.out.println("Старше 25 лет: " + getEmployeeNames(olderEmployees));

        System.out.println("Средний возраст больше 28: " + isAverageAgeGreaterThan(employees, 28));

        System.out.println("Самый молодой сотрудник: " + getYoungestEmployee(employees).getName());
    }
}
