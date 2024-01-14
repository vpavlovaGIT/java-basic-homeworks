package ru.pavlova.java.basic.homeworks.homework1;

import java.util.Scanner;

public class MainAppLesson1 {
    public static void main(String[] args) {
        consoleApplication();
    }

    public static void greeting() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("sum = " + sum);
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 21;
        if (data <= 10) {
            System.out.println("Красный");
        } else if ((data > 10) && (data <= 20)) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumber() {
        int a = 8;
        System.out.println("a = " + a);
        int b = 2;
        System.out.println("b = " + b);
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment != true) {
            System.out.println(initValue - delta);
        } else {
            System.out.println(initValue + delta);
        }
    }

    public static void consoleApplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int task = scanner.nextInt();
        if (task == 1) {
            greeting();
        } else if (task == 2) {
            int a = (int) (Math.random() * 10);
            System.out.println("a = " + a);
            int b = (int) (Math.random() * 10);
            System.out.println("b = " + b);
            int c = (int) (Math.random() * -10);
            System.out.println("c = " + c);
            checkSign(a, b, c);
        } else if (task == 3) {
            selectColor();
        } else if (task == 4) {
            compareNumber();
        } else {
            int initValue = (int) (Math.random() * 10);
            System.out.println("initValue = " + initValue);
            int delta = (int) (Math.random() * 10);
            System.out.println("delta = " + delta);
            boolean increment = true;
            System.out.println("increment = " + increment);
            addOrSubtractAndPrint(initValue, delta, increment);
        }
    }

}
