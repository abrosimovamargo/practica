package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_24Test {

    @Test
    public void testArray24() {
        int[] arr = new int[]{1,2,3,4,5};
        Class2_24.Array24(arr);
        assertEquals(arr[1],-3);
        Class2_24.Array24(arr);
        assertEquals(arr[1],2);
    }
}