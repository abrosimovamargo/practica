package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_11Test {
    double DELTA=0.0001;
    @Test
    public void testArray11() {
        int[] Arr1 = Class2_11.Array11(11);
        assertEquals(Arr1[0], 1, DELTA);
        assertEquals(Arr1[1], 11, DELTA);
    }
}