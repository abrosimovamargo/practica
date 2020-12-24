package ru.ssau.tk.abrosimovamargo.practice.String;

public class    Class3_2 {
    public void String2(String str){
        byte[] bytes = str.getBytes();
        for (byte byt:bytes) {
            System.out.println(byt);
        }
    }
}
