package ru.ssau.tk.abrosimovamargo.practice.array;

public class Class2_34 {
    static double Array34(double[] array) {
        double mult = 1;
        for (Double i : array
        ) {
            if (i != 0 & !i.isInfinite() & !i.isNaN()) {
                mult *= i;
            }

        }
        return mult;
    }

}
