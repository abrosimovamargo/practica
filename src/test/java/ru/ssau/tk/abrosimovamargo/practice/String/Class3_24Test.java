package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;

import static org.testng.Assert.*;

public class Class3_24Test {

    @Test
    public void testChangeCharsetStr() {
        String str = "hello world";
        Class3_24.changeCharsetStr(str, StandardCharsets.UTF_8, StandardCharsets.UTF_16LE);
        Class3_24.changeCharsetStr(str,StandardCharsets.UTF_16LE,StandardCharsets.UTF_8);
    }
}