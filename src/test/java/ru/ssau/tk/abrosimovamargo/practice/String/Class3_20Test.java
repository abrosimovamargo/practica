package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_20Test {

    @Test
    public void testString20() {
        String[] str = {"one", "two", "three"};
        assertEquals(Class3_20.String20(str), "one, two, three");
    }
}