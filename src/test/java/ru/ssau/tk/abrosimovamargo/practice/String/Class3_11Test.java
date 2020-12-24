package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_11Test {

    @Test
    public void testString11() {
        String[] array = new String[]{"abc", "asc", " abd ", "acd", "asd"};
        assertEquals(Class3_11.String11(array, "a", "c"), 2);
        assertEquals(Class3_11.String11(array,"a","d"),3);
    }
}