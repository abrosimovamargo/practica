package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_10 {
    static double[] Array10(int n, double b0, double q) {
        double[] arr = new double[n];
        arr[0] = b0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] * q;
        }
        return arr;
    }
}
