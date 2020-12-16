package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_1Test {

    @Test
    public void testArraySize() {
        int[] array_1 = Class2_1.ArraySize(1);
        int[] array_2 = Class2_1.ArraySize(3);
        int[] array_3 = Class2_1.ArraySize(7);
        int[] array_4 = Class2_1.ArraySize(4);
        int[] array_5 = Class2_1.ArraySize(9);
        int[] array_6 = Class2_1.ArraySize(10000);
        int[] array_7 = Class2_1.ArraySize(111);
        assertEquals(array_1.length, 1);
        assertEquals(array_2.length, 3);
        assertEquals(array_3.length, 7);
        assertEquals(array_4.length, 4);
        assertNotEquals(array_5.length, 1);
        assertNotEquals(array_6.length, 1);
        assertNotEquals(array_7.length, 1);
    }
}