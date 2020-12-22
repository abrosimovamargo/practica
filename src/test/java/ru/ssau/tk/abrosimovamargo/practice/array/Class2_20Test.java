package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_20Test {

    @Test
    public void testArray20() {
        int[] array = new int[]{1, 6, 5, 12, 20, 21, 6};
        int[] array_1 = new int[]{20,7,6,8,12,15,21,3};
        assertTrue(Class2_20.Array20(array));
        assertFalse(Class2_20.Array20(array_1));
    }
}