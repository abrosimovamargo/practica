package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_18 {
    static Integer Array18(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int max = 0;
        for (int i : arr) {
            if (arr[i + 1] > arr[i]) {
                max=  arr[i + 1];
            }
        }
        return max;
    }
}
