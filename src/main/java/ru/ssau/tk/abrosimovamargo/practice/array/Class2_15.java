package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_15 {
    static boolean Array15(int[] arr, int n) {
        for (int j : arr) {
            if (j == n) {
                return true;
            }
        }
        return false;
    }
}
