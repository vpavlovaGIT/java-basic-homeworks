package ru.pavlova.java.basic.homeworks.homework7;

public class ArraySumCalculator {

    public static int calculateArraySum(String[][] array) throws AppArraySizeException, AppArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new AppArraySizeException("Неверный размер массива");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Данные в ячейке [" + i + "][" + j + "] неверные");
                }
            }
        }
        return sum;
    }
}
