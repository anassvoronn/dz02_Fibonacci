package org.dz.solution;

public class FibonacciCalculator {

    public void calculator(int number) {
        int a = 0;
        int b = 1;
        int c = a + b;
        System.out.print(a + " ");
        System.out.print(b + " ");
        while (c < 1000) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
