package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_26 {
    static int[] Array26(int[] arr) {
        int[] arr1 = new int[arr.length / 2 + (arr.length % 2 == 0 ? 0 : 1)];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[2 * i] + (2 * i + 1 < arr.length ? arr[2 * i + 1] : 0);
        }
        return arr1;
    }
}
