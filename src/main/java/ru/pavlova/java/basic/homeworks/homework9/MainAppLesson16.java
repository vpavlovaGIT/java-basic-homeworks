package ru.pavlova.java.basic.homeworks.homework9;

public class MainAppLesson16 {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("123456789", new Person("Иван", "Иванов"));
        phoneBook.add("987654321", new Person("Петр", "Петров"));
        phoneBook.add("567890", new Person("Иван", "Иванов"));

        System.out.println(phoneBook.find("123456789"));
        System.out.println(phoneBook.find("567890"));
        System.out.println(phoneBook.containsPhoneNumber("987654321"));
    }
}

