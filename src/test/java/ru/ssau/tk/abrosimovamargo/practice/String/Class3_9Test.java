package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_9Test {

    @Test
    public void testString9() {
        assertEquals(Class3_9.String9("абвгд ","а"),0);
        assertEquals(Class3_9.String9("abc","c"),-1);
    }
}