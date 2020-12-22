package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_15Test {

    @Test
    public void testArray15() {
        int[] arr = {1,2,3,4,5};
        assertEquals(Class2_15.Array15(arr,2),true);
        assertEquals(Class2_15.Array15(arr,6),false);
    }
}