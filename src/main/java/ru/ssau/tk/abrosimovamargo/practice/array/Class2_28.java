package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_28 {
    static int[] longInt(long number) {
        return new int[]{(int) (number >>> 32), (int) (number)};
    }

    static long intLong(int[] number) {
        return ((long) number[0] << 32) | ((long) number[1] & 4294967295L);
    }
}
