package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_10Test {

    @Test
    public void testString10() {
        String[]arr = new String[]{"abc","asd","xyz","abbc"};
        assertEquals(Class3_10.String10(arr,"a","c"),2);
    }
}