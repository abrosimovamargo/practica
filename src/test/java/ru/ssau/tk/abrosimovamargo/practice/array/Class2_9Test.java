package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_9Test {
    int[] arr = new Class2_9().Array9(1, 1, 5);

    @Test
    public void testArray9() {
        assertEquals(arr.length, 5);
        assertEquals(arr[0], 1);
        assertEquals(arr[1], 2);
        assertEquals(arr[2], 3);
    }
}