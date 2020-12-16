package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_3Test {

    int[] array = new Class2_3().Array3(7);

    @Test
    public void testSetNumber() {
        assertEquals(array.length, 7);
        assertEquals(array[0], 1);
        assertEquals(array[1], 3);
        assertEquals(array[2], 5);
        assertEquals(array[3], 7);
    }
}
