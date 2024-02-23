package ru.pavlova.java.basic.homeworks.homework7;

public class MainAppLesson13 {
    public static void main(String[] args) {
        Car car = new Car(50);
        Horse horse = new Horse(80);
        Bicycle bicycle = new Bicycle();
        Vezdehod vezdehod = new Vezdehod();

        Person person1 = new Person("Иван");
        person1.setTransport(car);
        person1.move(20, "равнине");
        person1.move(10, "густому лесу");
        person1.exitTransport();
        person1.move(1, "густому лесу");

        Person person2 = new Person("Мария");
        person2.setTransport(horse);
        person2.move(15, "болоту");

        Person person3 = new Person("Петр");
        person3.setTransport(bicycle);
        person3.move(10, "равнине");

        Person person4 = new Person("Анна");
        person4.setTransport(vezdehod);
        person4.move(30, "болоту");

    }
}
