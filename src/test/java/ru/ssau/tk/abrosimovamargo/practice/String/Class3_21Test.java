package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_21Test {

    @Test
    public void testString21() {
        assertEquals(Class3_21.String21("01234"), "43210");
        assertEquals(Class3_21.String21("3A1b5C7"), "6C4b2A0");
        assertEquals(Class3_21.String21("AbCdeFgH"), "H6F4d2b0");
    }
}