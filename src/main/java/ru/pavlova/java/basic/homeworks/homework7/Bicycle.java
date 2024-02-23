package ru.pavlova.java.basic.homeworks.homework7;

public class Bicycle extends Transport {
    @Override
    public boolean move(int distance, String localType) {
        if (localType.equals("болоту")) {
            return false;
        } else {
            System.out.println("Велосипед проехал " + distance + " км по " + localType);
            return true;
        }
    }

    @Override
    String getType() {
        return "велосипед";
    }
}
