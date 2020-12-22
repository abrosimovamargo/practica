package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_23Test {

    @Test
    public void testArray23() {
        int[] arr = new int[]{1,2,3,4};
        Class2_23.Array23(arr);
        assertEquals(arr[0],4);
    }
}