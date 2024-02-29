package ru.pavlova.java.basic.homeworks.homework9;

public class MainAppLesson16 {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123456789");
        phoneBook.add("Сидоров", "987654321");
        phoneBook.add("Иванов", "111222333");

        System.out.println(phoneBook.find("Иванов"));
        System.out.println(phoneBook.containsPhoneNumber("987654321"));
    }
}

