package ru.pavlova.java.basic.homeworks.homework10;

import static ru.pavlova.java.basic.homeworks.homework10.BubleSort.bubbleSort;

public class MainAppLesson17 {
    public static void main(String[] args) {
        PersonDataBase personDataBase = new PersonDataBase();

        Person person1 = new Person("Alice", Position.MANAGER, 1L);
        Person person2 = new Person("Bob", Position.DEVELOPER, 2L);
        personDataBase.add(person1);
        personDataBase.add(person2);

        System.out.println("Person with id 1: " + personDataBase.findById(1L));
        System.out.println("Is person1 a manager " + personDataBase.isManager(person1));
        System.out.println("Is person2 an employee " + personDataBase.isEmployee(person2.getId()));

        int[] array = {4, 2, 7, 1, 9, 3};
        System.out.print("Unsorted array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        bubbleSort(array);
        System.out.print("\nSorted array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
