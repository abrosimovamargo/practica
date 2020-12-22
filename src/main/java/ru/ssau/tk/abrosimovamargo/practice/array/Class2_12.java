package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_12 {
    static double[] Array12(int n) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        double[] arr = new double[count * 2 + (Math.sqrt(n) == (int) Math.sqrt(n) ? 1 : 0)];
        int j = 0;
        for (int i = 0; i < (int) Math.sqrt(n); i++) {
            if (n % (i + 1) == 0) {
                arr[j] = (i + 1);
                arr[arr.length - j - 1] = n / (i + 1);
                j++;
            }
        }
        return arr;
    }
}
