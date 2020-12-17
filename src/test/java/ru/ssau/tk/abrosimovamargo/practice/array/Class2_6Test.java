package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_6Test {

    @Test
    public void testArray6() {

        int[] array = Class2_6.Array6(100);
        assertEquals(array.length, 100);
        assertEquals(array[1], 1);
        assertEquals(array[10], 100);
        assertEquals(array[4], 16);
        assertNotEquals(array[2], 9);
        assertNotEquals(array[6], 81);
    }
}
