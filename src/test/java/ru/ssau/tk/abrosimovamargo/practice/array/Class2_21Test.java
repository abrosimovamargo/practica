package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_21Test {

    @Test
    public void testArray21() {
        int[] array = new int[]{1,2,33,31,2,41,3};
        assertEquals(Class2_21.Array21(array),2);
        int[] temp = new int[]{1,7,1,1,2,0,15,-1};
        assertEquals(Class2_21.Array21(temp),1);
    }
}