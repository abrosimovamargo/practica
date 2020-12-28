package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_22Test {

    @Test
    public void testString22() {
        assertEquals(Class3_22.String22(1), "0");
        assertEquals(Class3_22.String22(10), "0123456789");
        assertEquals(Class3_22.String22(-5), "");
    }
}