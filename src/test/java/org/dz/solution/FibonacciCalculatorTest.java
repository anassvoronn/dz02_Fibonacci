package org.dz.solution;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciCalculatorTest {

    @Test
    public void getElementByIndexOf5() {
        FibonacciCalculator calculator = new FibonacciCalculator();
        int result = calculator.getElementByIndex(5);
        Assert.assertEquals(3, result);
    }

    @Test
    public void getElementByIndexOf10() {
        FibonacciCalculator calculator = new FibonacciCalculator();
        int result = calculator.getElementByIndex(10);
        Assert.assertEquals(34, result);
    }

    @Test
    public void getElementByIndexOf3() {
        FibonacciCalculator calculator = new FibonacciCalculator();
        int result = calculator.getElementByIndex(3);
        Assert.assertEquals(1, result);
    }

    @Test
    public void getElementByIndexOf2() {
        FibonacciCalculator calculator = new FibonacciCalculator();
        int result = calculator.getElementByIndex(2);
        Assert.assertEquals(1, result);
    }

    @Test
    public void getElementByIndexOf1() {
        FibonacciCalculator calculator = new FibonacciCalculator();
        int result = calculator.getElementByIndex(1);
        Assert.assertEquals(0, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementByIndexOf0() {
        FibonacciCalculator calculator = new FibonacciCalculator();
        calculator.getElementByIndex(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementByIndexOfMinus1() {
        FibonacciCalculator calculator = new FibonacciCalculator();
        calculator.getElementByIndex(-1);
    }


}