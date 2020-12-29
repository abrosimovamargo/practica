package ru.ssau.tk.abrosimovamargo.practice.zadachi;

import org.testng.annotations.Test;

import javax.lang.model.element.Name;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint test = new NamedPoint();

    @Test
    public void testSetName() {
        test.setName("1");
        assertEquals(test.getName(), "1");
        test.setName("B");
        assertEquals(test.getName(), "B");
        test.setName("c");
        assertEquals(test.getName(), "c");
    }

    @Test
    public void testGetName() {
        NamedPoint testTo = new NamedPoint(1, 2, 3, "myPoint");
        assertEquals(test.getName(), "Origin");
        assertEquals(testTo.getName(), "myPoint");
    }
    @Test
    public void testToString() {
        assertEquals(new NamedPoint(1, 2, 3, "Point").toString(), "Point: [1.0, 2.0, 3.0]");
        assertEquals(new NamedPoint(1, 2, 3).toString(), "[1.0, 2.0, 3.0]");
    }

}
