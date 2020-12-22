package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_29 {
    static int[] Array29(int size, int index) {
        if (index >= size) {
            return null;
        } else {
            int[] result = new int[size];
            for (int i = 0; i < size; i++) {
                result[i + index - (i + index >= size ? size : 0)] = i + 1;
            }
            return result;
        }
    }
}
