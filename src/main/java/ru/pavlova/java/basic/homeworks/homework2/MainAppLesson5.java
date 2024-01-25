package ru.pavlova.java.basic.homeworks.homework2;

import java.util.Arrays;

public class MainAppLesson5 {
    public static void main(String[] args) {
        sumArrays();
        sumOfParts();
        decreaseArray();
        reverseArray();
    }

    /**
     * Задание №1
     * Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
     * массив равный сумме входящих;
     * Пример: {1, 2, 3}
     *         + {2, 2}
     *         + {1, 1, 1, 1, 1}
     *         = {4, 5, 4, 1, 1}
     */
    private static void sumArrays() {
        int[] arr = {1, 1, 1};
        int[] arr2 = {2, 2, 2, 2};
        int[] arr3 = {3, 3, 3, 3, 3};
        int maxSize = Integer.max(Integer.max(arr.length, arr2.length), arr3.length);
        int[] sum = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            if (i < arr.length) {
                sum[i] += arr[i];
            }
            if (i < arr2.length) {
                sum[i] += arr2[i];
            }
            sum[i] += arr3[i];
        }

        System.out.println("Результат:\n" + "  " + Arrays.toString(arr));
        System.out.println("+ " + Arrays.toString(arr2));
        System.out.println("+ " + Arrays.toString(arr3));
        System.out.println("= " + Arrays.toString(sum));
    }

    /**
     * Задание №2
     * Реализуйте метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой части
     *         равны. “Точка находится между элементами”;
     *        Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }
     */
    private static void sumOfParts() {
        int[] arr = {5, 2, 1, 8};
        String[] strArr = new String[arr.length];
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                strArr[i] = arr[i] + " |";
            } else {
                strArr[i] = String.valueOf(arr[i]);
            }
        }
        System.out.println(Arrays.toString(strArr));
    }

    /**
     * Задание №3
     * Реализуйте метод, проверяющий что все элементы массива идут в порядке убывания
     */
    private static void decreaseArray() {
        int[] arrDesc = {5, 1, -8, -10, 73};
        boolean arrCheck = true;
        for (int i = 1; i < arrDesc.length; i++) {
            if (arrDesc[i] >= arrDesc[i - 1]) {
                arrCheck = false;
                break;
            }
        }
        System.out.println(Arrays.toString(arrDesc));
        System.out.println(arrCheck);
    }

    /**
     * Задание №4
     * Реализуйте метод, “переворачивающий” входящий массив
     * Пример: { 1 2 3 4 } => { 4 3 2 1 }
     */
    private static void reverseArray() {
        int[] arrReverse = {1, 2, 3, 4};
        int[] arrReverse2 = new int[arrReverse.length];
        for (int i = 0; i < arrReverse.length; i++) {
            arrReverse2[i] = arrReverse[i];
        }
        int left = 0;
        int right = arrReverse2.length - 1;
        while (left < right) {
            int temp = arrReverse2[left];
            arrReverse2[left] = arrReverse[right];
            arrReverse2[right] = temp;
            left++;
            right--;
        }
        System.out.print(Arrays.toString(arrReverse) + " =>\n" + Arrays.toString(arrReverse2));
    }

}
