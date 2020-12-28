package ru.ssau.tk.abrosimovamargo.practice.zadachi;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    double length(Point t){
        return java.lang.Math.sqrt(t.x * t.x + t.y * t.y + t.z*t.z);
    }
    public String toString() {
        return "[" + x + ", " + y + ", " + z + "]";
    }
}

