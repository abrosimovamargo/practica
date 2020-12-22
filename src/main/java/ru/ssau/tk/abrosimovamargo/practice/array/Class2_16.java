package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_16 {
    static boolean Array16(Integer[]  arr) {
        for (int n : arr) {
            if (arr[n] == null) {
                return true;
            }
        }
        return false;
    }
}