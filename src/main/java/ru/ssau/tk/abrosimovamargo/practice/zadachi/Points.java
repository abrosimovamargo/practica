package ru.ssau.tk.abrosimovamargo.practice.zadachi;

public class Points {
    private Points() {
    }
    public static Point sum(Point t1, Point t2){

        return new Point(t1.x + t2.x, t1.y + t2.y, t1.z + t2.z);
    }
    public static Point subtract(Point t1, Point t2){

        return new Point(t1.x - t2.x, t1.y - t2.y, t1.z - t2.z);
    }
    public static Point multiply(Point t1, Point t2){

        return new Point(t1.x * t2.x, t1.y * t2.y, t1.z * t2.z);
    }
    public static Point divide(Point t1, Point t2){

        return new Point(t1.x / t2.x, t1.y / t2.y, t1.z / t2.z);
    }
    public static Point enlarge(Point t, double a) {
        return new Point(t.x * a, t.y * a, t.z * a);
    }
}
