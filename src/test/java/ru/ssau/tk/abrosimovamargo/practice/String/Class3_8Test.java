package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_8Test {

    @Test
    public void testString8() {
        assertEquals(Class3_8.String8("abc", "xyz"), -1);
        assertEquals(Class3_8.String8("abc", "bc"), 1);
    }
}