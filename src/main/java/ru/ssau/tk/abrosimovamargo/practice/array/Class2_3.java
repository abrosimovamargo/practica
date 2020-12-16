package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_3 {

    public int[] Array3(int size) {
        int[] array = new int[size];
        int x=1;
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = x;
            x=x+2;
        }
        return array;
    }

}
