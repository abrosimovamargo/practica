package ru.ssau.tk.abrosimovamargo.practice.String;

public class Class3_21 {
    public static String String21(String str) {                                                     //3.21 в исходной строке заменить каждый чётный символ на номер этого символа, затем перевернуть строку
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                strBuilder.replace(i, i + 1, i + "");
            }
        }
        strBuilder.reverse();
        return strBuilder.toString();
    }
}
