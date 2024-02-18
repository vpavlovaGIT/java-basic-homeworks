package ru.pavlova.java.basic.homeworks.homework5;

public class MainAppLesson11 {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 15, 50);
        Dog dog = new Dog("Шарик", 20, 10, 100, 10);
        Horse horse = new Horse("Комета", 30, 8, 200, 20);

        double catRunningTime = cat.run(5);
        System.out.println("Время, затраченное на бег котом: " + catRunningTime);

        double dogSwimmingTime = dog.swim(20);
        System.out.println("Время, затраченное на плавание собакой: " + dogSwimmingTime);

        double horseSwimmingTime = horse.swim(50);
        System.out.println("Время, затраченное на плавание лошадью: " + horseSwimmingTime);
    }
}
