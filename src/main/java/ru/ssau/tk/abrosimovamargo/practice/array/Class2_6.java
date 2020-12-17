package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_6 {
    public static int[] Array6(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[0] = 1;
            } else {
                array[i] = i * i;
            }

        }
        return array;
    }
}
