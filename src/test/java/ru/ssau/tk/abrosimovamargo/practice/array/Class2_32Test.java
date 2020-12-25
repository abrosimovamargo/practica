package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_32Test {

    @Test
    public void testArray32() {
        double[] array = {5.5, 1, 0, 6};
        Class2_32.Array32(array);
        assertEquals(array[0], 0.0);
        assertEquals(array[1], 1.0);
        assertEquals(array[2], 5.5);
        assertEquals(array[3], 6.0);

        double[] array1 = new double[2];
        array1[0] = 1;
        array1[1] = Double.NaN;
        Class2_32.Array32(array1);
        assertEquals(array1[0], 1.0);
    }
}