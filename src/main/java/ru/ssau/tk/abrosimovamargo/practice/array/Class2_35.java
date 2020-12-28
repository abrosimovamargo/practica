package ru.ssau.tk.abrosimovamargo.practice.array;

import java.util.Collection;
import java.util.LinkedList;

public class Class2_35 {
    static Collection<String> toHexInSomeArray(int[] someArray) {
        Collection<String> hexStrings = new LinkedList<>();
        java.util.Arrays.stream(someArray).forEach(value -> hexStrings.add(Integer.toHexString(value)));
        return hexStrings;
    }
}
