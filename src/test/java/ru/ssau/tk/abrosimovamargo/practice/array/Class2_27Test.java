package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class2_27Test {

    @Test
    public void testArray27() {
        assertEquals(Class2_27.Array27(new int[]{1, 2, 3, 4, 5}), new boolean[]{false, true, false, true, false});
    }
}
