package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_19 {
    static int Array19(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum = arr[i];
                sum += arr[i];
            }
        }
        return sum;
    }
}
