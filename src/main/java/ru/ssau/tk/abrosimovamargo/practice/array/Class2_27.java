package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_27 {
    static boolean[] Array27(int[] arr) {
        boolean[] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1 [i] = arr[i] % 2 == 0;
        }
        return arr1 ;
    }
}
