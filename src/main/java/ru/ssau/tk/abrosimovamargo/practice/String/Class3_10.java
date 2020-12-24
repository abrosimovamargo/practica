package ru.ssau.tk.abrosimovamargo.practice.String;

public class Class3_10 {
    static int String10(String[] arr, String prefix, String postfix) {
        int c = 0;
        for (String string : arr) {
            if (string.startsWith(prefix) && string.endsWith(postfix)) {
                c++;
            }
        }
        return c;
    }
}
