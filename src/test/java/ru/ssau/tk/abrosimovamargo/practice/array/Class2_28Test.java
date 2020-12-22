package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_28Test {

    @Test
    public void testLongInt() {
        assertEquals(Class2_28.intLong(Class2_28.longInt(1198L)), 1198L);
    }
}