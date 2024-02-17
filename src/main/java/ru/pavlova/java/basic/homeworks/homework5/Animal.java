package ru.pavlova.java.basic.homeworks.homework5;

public class Animal {

    private String name;
    private double runningSpeed;
    private double swimmingSpeed;
    private int hardiness;
    private boolean tired;

    public Animal(String name, double runningSpeed, double swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.hardiness = hardiness;
        this.tired = false;
    }

    public double getRunningSpeed() {
        return runningSpeed;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public int getHardiness() {
        return hardiness;
    }

    public boolean isTired() {
        return tired;
    }

    public double run(int distance) {
        double time = distance / runningSpeed;
        int hardinessCost = distance;
        if (hardinessCost <= hardiness) {
            hardiness -= hardinessCost;
        } else {
            tired = true;
            time = -1;
        }
        return time;
    }

    public double swim(int distance) {
        double time = -1;
        if (this instanceof Dog) {
            time = distance / swimmingSpeed;
            int hardinessCost = distance * 2;
            if (hardinessCost <= hardiness) {
                hardiness -= hardinessCost;
            } else {
                tired = true;
                time = -1;
            }
        } else if (this instanceof Horse) {
            time = distance / swimmingSpeed;
            int hardinessCost = distance * 4;
            if (hardinessCost <= hardiness) {
                hardiness -= hardinessCost;
            } else {
                tired = true;
                time = -1;
            }
        } else {
            System.out.println("Коты не умеют плавать!");
        }
        return time;
    }
}
