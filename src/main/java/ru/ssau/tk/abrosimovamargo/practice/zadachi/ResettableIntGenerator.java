package ru.ssau.tk.abrosimovamargo.practice.zadachi;

public class ResettableIntGenerator implements IntGenerator, Resettable {
    private int count = 0;

    @Override
    public int nextInt() {
        return count++;
    }

    @Override
    public void reset() {
        count = 0;
    }
}
