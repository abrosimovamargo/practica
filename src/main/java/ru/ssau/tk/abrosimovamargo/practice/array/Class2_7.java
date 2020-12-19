package ru.ssau.tk.abrosimovamargo.practice.array;

class Class2_7 {
    public static double[] Array7(double a, double b, double c) throws Exception {
        if (a == 0) {
            if (b == 0) {
                if (c != 0) {
                    throw new Exception("нет  корней");
                } else {
                    throw new Exception("комплексные корни ");
                }
            } else {
                return new double[]{-c / b};// bx+c = 0
            }
        } else {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                return new double[]{(-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a)};
            } else if (d == 0) {
                return new double[]{-b / (2 * a)};
            } else {
                throw new NullPointerException("Решение не относится к вещественным числам");
            }
        }
    }
}
