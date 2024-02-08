package ru.pavlova.java.basic.homeworks.homework4;

public class User {

    private String surname;
    private String name;
    private String patronymic;
    private int birthYear;
    private String email;

    public User(String surname, String name, String patronymic, int birthYear, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.email = email;
    }

    public void printUserInfo() {
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("E-mail: " + email);
        System.out.println();
    }

    public int getAge() {
        int age;
        int currentYear = java.time.Year.now().getValue();
        age = currentYear - birthYear;
        return age;
    }
}
