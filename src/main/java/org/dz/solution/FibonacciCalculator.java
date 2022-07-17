package org.dz.solution;

public class FibonacciCalculator {

    public int getElementByIndex(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number can't be negative");
        }
        if (number == 1) {
            return 0;
        }
        int prev2 = 0;
        int prev1 = 1;
        int current = prev2 + prev1;

        for (int i = number - 3; i > 0; i--) {
            prev2 = prev1;
            prev1 = current;
            current = prev2 + prev1;
        }

        return current;
    }

}
