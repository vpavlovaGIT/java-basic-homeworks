package ru.pavlova.java.basic.homeworks.homework13;

public class FillThread extends Thread {
    private double[] array;
    private int start;
    private int end;

    public FillThread(double[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
