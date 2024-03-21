package ru.pavlova.java.basic.homeworks.homework13;

public class ArrayFillerMultiThread {

    public static void multiThreadFill() {
        long startTime = System.currentTimeMillis();
        double[] array = new double[100_000_000];
        int quarterSize = array.length / 4;

        Thread[] threads = new Thread[4];
        for (int i = 0; i < 4; i++) {
            int start = i * quarterSize;
            int end = (i + 1) * quarterSize;
            threads[i] = new FillThread(array, start, end);
            threads[i].start();
        }

        try {
            for (int i = 0; i < 4; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения (4 потока): " + (endTime - startTime) + " мс");

    }
}
