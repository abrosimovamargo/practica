package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_2Test {

    @Test
    public void testString2() {
        String strt1 = "abc";
        new Class3_2().String2(strt1);
        String strt2 = "абв";
        new Class3_2().String2(strt2);
    }
}
