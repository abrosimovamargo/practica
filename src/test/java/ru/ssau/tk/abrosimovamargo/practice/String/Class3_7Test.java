package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_7Test {

    @Test
    public void testString7() {
        assertEquals(Class3_7.String7("abcabbbaabcabc","ca"),2);
    }
}