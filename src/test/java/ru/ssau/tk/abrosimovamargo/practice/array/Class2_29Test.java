package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_29Test {

    @Test
    public void testArray29() {
        int[] array = Class2_29.Array29(5, 3);
        int[] array_1 = Class2_29.Array29(3, 2);
        assertEquals(array[0], 3);
        assertEquals(array[1], 4);
        assertEquals(array_1[0], 2);
        assertEquals(array_1[1], 3);
    }
}