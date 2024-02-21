package ru.pavlova.java.basic.homeworks.homework5;

public class MainAppLesson11 {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 15, 50);
        Dog dog = new Dog("Шарик", 8, 2, 100);
        Horse horse = new Horse("Комета", 12, 3, 200);

        double catRunningTime = cat.run(5);
        System.out.println("Время, затраченное на бег котом: " + catRunningTime);

        double dogSwimmingTime = dog.swim(10);
        System.out.println("Время, затраченное на плавание собакой: " + dogSwimmingTime);

        double horseSwimmingTime = horse.swim(30);
        System.out.println("Время, затраченное на плавание лошадью: " + horseSwimmingTime);
    }
}
