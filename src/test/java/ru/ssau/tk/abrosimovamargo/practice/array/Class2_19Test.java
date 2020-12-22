package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_19Test {

    @Test
    public void testArray19() {
        int[] array = new int[]{1,2,3,4,5,6,7};
        assertEquals(Class2_19.Array19(array),14);
    }
}