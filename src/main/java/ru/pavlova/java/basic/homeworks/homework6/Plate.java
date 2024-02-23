package ru.pavlova.java.basic.homeworks.homework6;

public class Plate {
    private int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void addFood(int food) {
        if (currentFood + food <= maxFood) {
            currentFood += food;
            System.out.println("Добавлено " + food + " единиц еды в тарелку");
        } else {
            System.out.println("Невозможно добавить такое количество еды, тарелка будет переполнена");
        }
    }

    public boolean decreaseFood(int food) {
        if (currentFood >= food) {
            currentFood -= food;
            System.out.println("Съедено " + food + " единиц еды");
            return true;
        } else {
            System.out.println("В тарелке осталось недостаточно еды");
            return false;
        }
    }

    public void info() {
        System.out.println("В тарелке осталось " + currentFood + " единиц еды");
    }
}
