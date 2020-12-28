package ru.ssau.tk.abrosimovamargo.practice.String;

public class Class3_3 {
    void sameStrings() {
        String s1 = "A";
        String s2 = new String(s1);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
