package ru.pavlova.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            satiety = true;
        }
    }

    public void info() {
        System.out.println("Кот " + name + ": сытость - " + satiety);
    }
}
