package ru.ssau.tk.abrosimovamargo.practice.zadachi;

public abstract class Operation {
    abstract double apply(double number);

    double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}
