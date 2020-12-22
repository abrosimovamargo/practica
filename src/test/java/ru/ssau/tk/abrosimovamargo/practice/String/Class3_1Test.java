package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_1Test {

    @Test
    public void testString1() {
        String String = new String("str1,str2");
        new Class3_1().String1(String);
    }
}