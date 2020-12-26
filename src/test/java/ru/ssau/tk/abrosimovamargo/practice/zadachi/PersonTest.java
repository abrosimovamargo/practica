package ru.ssau.tk.abrosimovamargo.practice.zadachi;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    @Test
    public void testTestToString() {
        Person human1 = new Person("Rita", "Abrosimova", 862495137);
        Person human2 = new Person("Danila", "Prasolov", 753912684);

        assertEquals(human1.toString(), "Rita Abrosimova");
        assertEquals(human2.toString(), "Danila Prasolov");
        human2.setLastName("");
        assertEquals(human2.toString(), "Danila");
        human1.setFirstName("");
        human1.setLastName("");
        assertEquals(human1.toString(), "");
    }
}