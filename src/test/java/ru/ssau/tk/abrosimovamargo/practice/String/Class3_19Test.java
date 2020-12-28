package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class3_19Test {

    @Test
    public void testParseStringOnArray() {
        String str = "ftfiuh skhdbd sjsjskdl akhblk";
        String[] arrayStr = Class3_19.parseStringOnArray(str);
        for (String string : arrayStr) {
            System.out.println(string);
        }
    }
}