package ru.pavlova.java.basic.homeworks.homework5;

public class Animal {

    private String name;
    private double runningSpeed;
    int hardiness;
    boolean tired;

    public Animal(String name, double runningSpeed, int hardiness) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.hardiness = hardiness;
        this.tired = false;
    }

    public double getRunningSpeed() {
        return runningSpeed;
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
}
