package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_2Test {
    int[] array = new Class2_2().setNum(8);

    @Test
    public void testSetNum() {
        assertEquals(array.length, 8);
        assertEquals(array[1], 1);
        assertEquals(array[0], 2);
    }
}
