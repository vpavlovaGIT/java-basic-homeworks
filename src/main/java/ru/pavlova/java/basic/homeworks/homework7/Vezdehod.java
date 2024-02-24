package ru.pavlova.java.basic.homeworks.homework7;

public class Vezdehod extends Transport {
    @Override
    public boolean move(int distance, String localType) {
        System.out.println("Вездеход проехал " + distance + " км по " + localType);
        return true;
    }

    @Override
    String getType() {
        return "вездеход";
    }
}
