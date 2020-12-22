package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_17Test {

    @Test
    public void testArray17() {
        int[] arr = new int[5];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        assertEquals(Class2_17.Array17(arr), 3);
    }
}
