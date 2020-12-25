package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_34Test {

    @Test
    public void testArray34() {
        double[] array = {1, 2, 3};
        assertEquals(Class2_34.Array34(array), 6.0);
        double[] array1 = {0, 1, 2, 0, 0};
        assertEquals(Class2_34.Array34(array1), 2.0);
    }
}