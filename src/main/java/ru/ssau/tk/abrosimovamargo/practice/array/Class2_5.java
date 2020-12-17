package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_5 {
    public static int[] Array5(int n) {
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }
}

