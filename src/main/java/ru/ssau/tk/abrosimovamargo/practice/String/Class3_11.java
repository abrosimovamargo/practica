package ru.ssau.tk.abrosimovamargo.practice.String;

public class Class3_11 {
    static int String11(String[] arr, String prefix, String postfix) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
        }
        for (String str : arr) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                number++;
            }
        }
        return number;
    }
}
