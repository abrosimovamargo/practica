package ru.ssau.tk.abrosimovamargo.practice.String;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Class3_23 {
    public static String String23(String string) {
        byte[] byteString = string.getBytes(Charset.defaultCharset());
        return new String(byteString, StandardCharsets.UTF_16);
    }
}