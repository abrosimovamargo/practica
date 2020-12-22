package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_20 {
    static boolean Array20(int[] array) {
        int c1 = 0;
        int c2 = 0;
        for (int j : array) {
            if (j % array[0] == 0)
                c1++;
        }
        for (int i : array) {
            if (i % array[array.length - 1] == 0)
                c2++;
        }
        return c1 > c2;
    }
}
