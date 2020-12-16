package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_1 {
    public static int[] ArraySize(int s) {
        int[] array = new int[s];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}

