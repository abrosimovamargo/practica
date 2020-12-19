package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_8Test {
    double[] arr = new Class2_8().Array8(8);

    @Test
    public void testArray8() {
        assertEquals(arr.length, 8);
        assertEquals(arr[0], 1.0);
        assertEquals(arr[2], 4.0);
        assertEquals(arr[3], 5.0);

    }
}
