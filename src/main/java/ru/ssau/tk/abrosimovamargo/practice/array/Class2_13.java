package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_13 {
    public static int[] Array13(int n) {
        if (n == 0){
            return null;
        }
        int[] arr = new int[n];
        for (int i = 0; i < Math.ceil((double)n/2); i++){
            arr[i] = i+1;
            arr[n-i-1] = i+1;
        }
        return arr;
    }
}
