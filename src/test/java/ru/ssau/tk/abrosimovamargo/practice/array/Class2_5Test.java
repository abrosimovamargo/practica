package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_5Test {

    @Test
    public void testArray5() {
        int[] array = Class2_5.Array5(7);
        assertEquals(array[0],1);
        assertEquals(array[1],1);
        assertEquals(array[2],2);
        assertEquals(array[3],3);
        assertEquals(array[4],5);
        assertEquals(array[5],8);
        assertEquals(array[6],13);
        assertNotEquals(array[2],1);
        assertNotEquals(array[4],2);
        assertNotEquals(array[6],3);
    }
}
