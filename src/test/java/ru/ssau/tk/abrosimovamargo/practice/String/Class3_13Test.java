package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_13Test {

    @Test
    public void testString13() {
        String str = "i understend this now";
        assertEquals(Class3_13.String13(str, -1, 14), str.substring(0,14 ));
    }
}