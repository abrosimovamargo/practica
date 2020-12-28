package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import java.util.Collection;

import static org.testng.Assert.*;

public class Class2_35Test {

    @Test
    public void testToHexInSomeArray() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        Collection<String> hexStrings = Class2_35.toHexInSomeArray(array);
        for (String hexString : hexStrings) {
            System.out.println(hexString);
        }
    }
}