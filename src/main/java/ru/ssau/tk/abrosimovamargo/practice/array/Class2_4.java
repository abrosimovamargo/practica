package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_4 {
    public  int[] Array4(int size) {
        int[] array = new int[size];
        int x=2*size;
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = x;
            x-=2;
        }
        return array;
    }
}
