package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_32 {
    static void Array32(double[] array) {
        for (Double arr : array) {
            if (arr.isNaN()) {
                return;
            } else {
                java.util.Arrays.sort(array);
            }
        }
    }
}
