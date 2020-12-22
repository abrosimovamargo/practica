package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_10Test {
    double[] arr = new Class2_10().Array10(6, 1.0, 2.0);
    @Test
    public void testArray10() {
        assertEquals(arr.length, 6);
        assertEquals(arr[0], 1.0);
        assertEquals(arr[1], 2.0);
        assertEquals(arr[2], 4.0);

    }
}