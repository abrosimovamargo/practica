package ru.ssau.tk.abrosimovamargo.practice.Class4;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.abrosimovamargo.practice.zadachi.Person;

import static org.testng.Assert.*;

public class Class4_1Test {

    @Test
    public void getObjectPerson() {
        Person p1 = new Person("Rita", "Abrosimova");
        assertEquals(Class4_1.getObjectPerson(p1), "Rita Abrosimova");
        Person p2 = new Person(null, null);
        Assert.assertThrows(NullPointerException.class, () -> {
            assertNull(p2);
        });
    }
}