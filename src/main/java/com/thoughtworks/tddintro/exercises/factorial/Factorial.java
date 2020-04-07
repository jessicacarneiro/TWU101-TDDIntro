package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        if (this.isNegative(i)) {
            throw new IllegalArgumentException();
        }

        if (i <= 1) {
            return 1;
        }

        return i * this.compute(i-1);
    }

    private boolean isNegative(int i) {
        return i < 0;
    }
}
