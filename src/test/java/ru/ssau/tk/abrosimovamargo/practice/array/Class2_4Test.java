package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_4Test {
    int[] array = new Class2_4().Array4(7);

    @Test
    public void testArray4() {
        assertEquals(array.length, 7);
        assertEquals(array[2], 10);
        assertEquals(array[3], 8);
    }
}

