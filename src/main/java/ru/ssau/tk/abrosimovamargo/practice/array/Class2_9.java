package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_9 {
    public static int[] Array9(int N, int d, int size) {
        int[] arr = new int[size];
        arr[0] = N;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + d;
        }
        return arr;
    }
}
