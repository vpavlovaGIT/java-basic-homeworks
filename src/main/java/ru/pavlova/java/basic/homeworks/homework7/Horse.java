package ru.pavlova.java.basic.homeworks.homework7;

public class Horse extends Transport {
    private int hardiness;

    public Horse(int hardiness) {
        this.hardiness = hardiness;
    }

    @Override
    public boolean move(int distance, String localType) {
        if (localType.equals("болоту") || hardiness <= 0) {
            return false;
        } else {
            System.out.println("Лошадь проскакала " + distance + " км по " + localType);
            hardiness -= distance;
            return true;
        }
    }

    @Override
    String getType() {
        return "лошадь";
    }
}
