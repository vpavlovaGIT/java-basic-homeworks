package ru.pavlova.java.basic.homeworks.homework6;

public class MainAppLesson12 {
    public static void main(String[] args) {
        Plate plate = new Plate(20);
        plate.info();

        Cat[] cats = {
                new Cat("Барсик", 5),
                new Cat("Мурзик", 7),
                new Cat("Рыжик", 10)
        };

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(15);
        plate.info();
    }
}