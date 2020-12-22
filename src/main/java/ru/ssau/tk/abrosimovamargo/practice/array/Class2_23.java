package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_23 {
    static void Array23(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
            min = arr[i] < min ? arr[i] : min;
        }
        int indexmin = 0;
        int indexmax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                indexmin = i;
            }
            if (arr[i] == max) {
                indexmax = i;
            }
        }
        arr[indexmin] = max;
        arr[indexmax] = min;
    }
}
