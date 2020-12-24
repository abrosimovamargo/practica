package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_4Test {

    @Test
    public void testString4() {
        assertEquals(Class3_4.String4("abab"),false);
        assertEquals(Class3_4.String4("babab"),true);
    }
}