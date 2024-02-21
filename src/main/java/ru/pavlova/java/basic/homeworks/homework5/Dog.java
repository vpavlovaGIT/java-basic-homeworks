package ru.pavlova.java.basic.homeworks.homework5;

public class Dog extends Animal {
    private double swimmingSpeed;

    public Dog(String name, double runningSpeed, double swimmingSpeed, int hardiness) {
        super(name, runningSpeed, hardiness);
        this.swimmingSpeed = swimmingSpeed;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public double swim(int distance) {
        double time = distance / swimmingSpeed;
        int hardinessCost = distance * 2;
        if (hardinessCost <= getHardiness()) {
            this.hardiness -= hardinessCost;
        } else {
            this.tired = true;
            time = -1;
        }
        return time;
    }
}
