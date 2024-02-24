package ru.pavlova.java.basic.homeworks.homework7;

public class Person {
    private String name;
    private Transport currentTransport;

    public Person(String name) {
        this.name = name;
    }

    public void setTransport(Transport transport) {
        System.out.println(name + " сел(а) на " + transport.getType());
        currentTransport = transport;
    }

    public boolean move(int distance, String localType) {
        if (currentTransport != null) {
            return currentTransport.move(distance, localType);
        } else {
            System.out.println(name + " прошел(а) пешком " + distance + " км по " + localType);
            return true;
        }
    }

    public void exitTransport() {
        System.out.println(name + " покинул(а) средство передвижения");
        currentTransport = null;
    }
}
