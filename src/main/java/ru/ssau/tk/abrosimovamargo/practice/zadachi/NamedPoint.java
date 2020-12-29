package ru.ssau.tk.abrosimovamargo.practice.zadachi;

import java.util.Objects;

public class NamedPoint extends Point implements Resettable{
    public String name;

    public String toString() {
        if (Objects.equals(null, name)) return super.toString();
        return name + ": " + super.toString();
    }
    NamedPoint() {
        this(0, 0, 0, "Origin");
    }

    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void reset() {
        name = "Absent";
    }
}
