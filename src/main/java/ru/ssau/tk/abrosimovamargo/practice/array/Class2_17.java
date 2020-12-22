package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_17 {
    static int Array17(int[] arr) {
        int c = 0;
        for (int i : arr) {
            if (arr[i] % 2 == 0) {
                c+=1;
            }
        }
        return c;
    }
}
