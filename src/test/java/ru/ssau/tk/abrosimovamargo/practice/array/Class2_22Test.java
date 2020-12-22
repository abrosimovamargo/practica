package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_22Test {

    @Test
    public void testArray22() {
        int[] array = new int[]{1,2,3,4};
        assertEquals(Class2_22.Array22(array,3),2);
    }
}