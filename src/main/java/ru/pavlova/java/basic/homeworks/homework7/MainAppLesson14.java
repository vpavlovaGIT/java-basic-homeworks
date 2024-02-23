package ru.pavlova.java.basic.homeworks.homework7;

import static ru.pavlova.java.basic.homeworks.homework7.ArraySumCalculator.calculateArraySum;

public class MainAppLesson14 {
    public static void main(String[] args) {
        String[][] inputArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int sum = calculateArraySum(inputArray);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }
}
