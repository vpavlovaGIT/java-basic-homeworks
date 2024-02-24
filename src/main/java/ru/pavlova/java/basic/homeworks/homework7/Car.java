package ru.pavlova.java.basic.homeworks.homework7;

public class Car extends Transport {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distance, String localType) {
        if ((localType.equals("густому лесу") || localType.equals("болоту")) || fuel <= 0) {
            return false;
        } else {
            System.out.println("Машина проехала " + distance + " км по " + localType);
            fuel -= distance;
            return true;
        }
    }

    @Override
    String getType() {
        return "машину";
    }
}
