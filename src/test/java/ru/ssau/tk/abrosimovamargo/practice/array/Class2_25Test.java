package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_25Test {

    @Test
    public void testArray25() {
        int[] arr = new int[]{1,2,3,4,5};
        int[] array1 = Class2_25.Array25(arr);
        assertEquals(array1[1],-3);
        assertEquals(arr[1],2);
    }
}