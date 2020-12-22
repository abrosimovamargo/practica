package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_25 {
    static int[] Array25(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ~arr1[i];
        }
        return arr1;
    }
}
