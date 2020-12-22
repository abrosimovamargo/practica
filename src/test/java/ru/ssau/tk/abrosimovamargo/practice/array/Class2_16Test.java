package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_16Test {

    @Test
    public void testArray16() {
        Integer[] arr = new Integer[5];
        arr[1] = null;
        arr[0] = 1;
        arr[2] = 2;
        arr[3] = 5;
        arr[4] = null;
        assertTrue(Class2_16.Array16(arr));
    }
}