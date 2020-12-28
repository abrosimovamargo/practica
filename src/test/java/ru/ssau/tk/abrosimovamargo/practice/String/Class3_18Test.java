package ru.ssau.tk.abrosimovamargo.practice.String;

import org.testng.annotations.Test;
import ru.ssau.tk.abrosimovamargo.practice.array.Matrix;
import ru.ssau.tk.abrosimovamargo.practice.zadachi.NamedPoint;
import ru.ssau.tk.abrosimovamargo.practice.zadachi.Person;
import ru.ssau.tk.abrosimovamargo.practice.zadachi.Point;

import static org.testng.Assert.*;

public class Class3_18Test {

    @Test
    public void testGetDescription() {
        Matrix matrix = new Matrix(3, 3);
        matrix.setAt(0, 0, 1);
        matrix.setAt(0, 1, 2);
        matrix.setAt(0, 2, 3);
        matrix.setAt(1, 0, 4);
        matrix.setAt(1, 1, 5);
        matrix.setAt(1, 2, 6);
        matrix.setAt(2, 0, 7);
        matrix.setAt(2, 1, 8);
        matrix.setAt(2, 2, 9);
        Class3_18.getDescription(matrix);
        Class3_18.getDescription(new Person("Rita", "Abrosimova", 828183));
        Class3_18.getDescription(new Point(0, 1, 2));
        Class3_18.getDescription(new NamedPoint(0, 1, 4, "X"));

    }
}