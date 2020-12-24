package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_12Test {

    @Test
    public void testString12() {
        assertEquals(new Class3_12().String12("opopopopo", "opo", "po"), "popppo");
    }
}