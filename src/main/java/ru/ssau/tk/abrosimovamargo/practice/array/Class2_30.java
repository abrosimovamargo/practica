package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_30 {
    static int[][] Array30(int n) {
        int[][] array = new int[n][];
        int m = n;
        int k = 1;
        for (int i = 0; i < n; i++) {
            array[i] = new int[m];
            for (int j = 0; j < m; j++) {
                array[i][j] = k;
                k++;
            }
            m--;
        }
        return array;
    }

}
