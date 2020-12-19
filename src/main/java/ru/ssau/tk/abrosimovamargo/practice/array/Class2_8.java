package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_8 {
    static double[] Array8(int size) {
        double[] arr = new double[size];
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (j % 3 == 0) {
                j++;
            }
            arr[i] = j;
            j++;
        }
        return arr;
    }
}
