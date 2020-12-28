package ru.ssau.tk.abrosimovamargo.practice.String;

public class Class3_22 {
    public static String String22(int number) {
        StringBuilder stringNumbers = new StringBuilder();
        for (int i = 0; i < number; i++) {
            stringNumbers.append(i);
        }
        return stringNumbers.toString();
    }
}
