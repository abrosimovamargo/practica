package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_22 {
    static   int  Array22 ( int [] arr , int  N ) {
        int j =  0 ;
        for ( int i =  0 ; i < arr . length; i ++ ) {
            if (arr [i] == N) {
                j = i;
            }
        }
        return j;
    }
}
