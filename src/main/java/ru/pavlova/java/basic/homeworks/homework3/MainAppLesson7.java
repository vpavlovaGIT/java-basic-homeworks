package ru.pavlova.java.basic.homeworks.homework3;

public class MainAppLesson7 {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, -2, 3},
                {-4, 5, -6},
                {7, -8, 9}
        };
        int[][] array2 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 3},
                {1, 1, 9, 14, 15},
                {8, 17, 22, 9, 3},
                {2, 5, 13, 24, 25}
        };
        int[][] array3 = new int[3][3];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = (int) (Math.random() * 10);
            }
        }
        printArray(array1);
        System.out.println(sumOfPositiveElements(array1) + "\n");
        printSquare(4);
        printArray(array2);
        crossZero(array2);
        printArray(array2);
        System.out.println();
        printArray(array3);
        System.out.println(findMax(array3) + "\n");
        printArray(array3);
        System.out.println(sumOfRow(array3));
    }

    /**
     * Метод для печати массива
     */
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Задание №1
     * Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный
     * массив, метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0
     */
    private static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    /**
     * Задание №2
     * Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из
     * символов * со сторонами соответствующей длины
     */
    private static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Задание №3
     * Реализовать метод, принимающий в качестве аргумента квадратный двумерный целочисленный массив, и
     * зануляющий его диагональные элементы
     */
    private static void crossZero(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i][i] = 0;
            array[i][n - i - 1] = 0;
        }
        System.out.println();
    }

    /**
     * Задание №4
     * Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива
     */
    private static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] row : array) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    /**
     * Задание №5
     * Реализуйте метод, который считает сумму элементов второй строки,
     * если второй строки не существует, то в качестве результата необходимо вернуть -1
     */
    private static int sumOfRow(int[][] array) {
        if (array.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int num : array[1]) {
            sum += num;
        }
        return sum;
    }

}
