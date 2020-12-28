package ru.ssau.tk.abrosimovamargo.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatrixTest {

    Matrix myMatrix1 = new Matrix(3, 2);
    Matrix myMatrix2 = new Matrix(5, 1);
    Matrix myMatrix3 = new Matrix(7, 4);

    @Test
    public void testGetN() {
        assertEquals(myMatrix1.getN(), 3);
        assertEquals(myMatrix2.getN(), 5);
        assertEquals(myMatrix3.getN(), 7);
    }

    @Test
    public void testGetM() {
        assertEquals(myMatrix1.getM(), 2);
        assertEquals(myMatrix2.getM(), 1);
        assertEquals(myMatrix3.getM(), 4);
    }

    @Test
    public void testSetAtAndGetAt() {
        myMatrix1.setAt(0, 0, 10.0);
        myMatrix1.setAt(2, 1, -3.0);
        assertEquals(myMatrix1.getAt(0, 0), 10.0);
        assertEquals(myMatrix1.getAt(2, 1), -3.0);

        myMatrix2.setAt(3, 0, 54.0);
        myMatrix2.setAt(2, 0, -27.0);
        assertEquals(myMatrix2.getAt(3, 0), 54.0);
        assertEquals(myMatrix2.getAt(2, 0), -27.0);

        myMatrix3.setAt(1, 2, -11.0);
        myMatrix3.setAt(3, 1, 0.0);
        assertEquals(myMatrix3.getAt(1, 2), -11.0);
        assertEquals(myMatrix3.getAt(3, 1), 0.0);
    }

    @Test
    public void testTestToString() {
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.setAt(0, 0, 1);
        firstMatrix.setAt(0, 1, 2);
        firstMatrix.setAt(1, 0, 3);
        firstMatrix.setAt(1, 1, 4);
        System.out.println(firstMatrix);

    }
}