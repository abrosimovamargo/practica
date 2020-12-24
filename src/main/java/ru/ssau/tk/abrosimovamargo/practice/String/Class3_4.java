package ru.ssau.tk.abrosimovamargo.practice.String;

public class Class3_4 {
    static boolean String4(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
