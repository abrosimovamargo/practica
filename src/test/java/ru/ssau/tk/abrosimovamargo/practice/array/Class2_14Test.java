package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_14Test {

    @Test
    public void testArray14() {
        double arr[] = new double[] {-1,-3,10,2};
        Class2_14.Array14(arr);
        assertEquals(arr[0], 1.0);
        assertEquals(arr[1], 3.0);
        assertEquals(arr[2], -10.0);
        assertEquals(arr[3], -2.0);
    }
}