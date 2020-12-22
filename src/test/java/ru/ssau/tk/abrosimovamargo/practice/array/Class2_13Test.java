package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_13Test {
    double DELTA = 0.0001;
    @Test
    public void testArray13() {
        int[] arr1 = Class2_13.Array13(7);
        double DELTA = 0.0001;
        assertEquals(arr1[0], 1, DELTA);
        assertEquals(arr1[6], 1, DELTA);
        assertEquals(arr1[3], 4, DELTA);
        assertEquals(arr1[2], 3, DELTA);
    }
}