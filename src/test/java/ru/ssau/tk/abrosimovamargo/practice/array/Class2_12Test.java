package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_12Test {
    double DELTA=0.0001;
    @Test
    public void testArray12() {
        double[] Arr1 = Class2_12.Array12(12);
        assertEquals(Arr1[0], 1, DELTA);
        assertEquals(Arr1[1], 2, DELTA);
        assertEquals(Arr1[2], 3, DELTA);
    }
}