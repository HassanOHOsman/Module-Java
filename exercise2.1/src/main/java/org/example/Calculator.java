package org.example;

/**
 * Represents a calculator that performs basic arithmetic operations.
 *
 * @author Hassan Osman
 * @version 2.0
 * @since 1.0
 * @see IllegalArgumentException
 * @see Math
 */
public class Calculator {
    /**
     * Calculates the sum of two integers.
     *
     * @param a the first integer to add to
     * @param b the second integer to add
     * @return the sum of {@code a} and {@code b}
     */
    public int add(int a, int b) {
        return a + b;
    }


    /**
     * Subtracts one integer from another.
     *
     * @param a the integer to subtract from
     * @param b the integer to subtract
     * @return the subtraction of {@code b} from {@code a}
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Calculates the multiplication of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the multiplication of {@code a} and {@code b}
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    public int square(int a) {
        return a * a;
    }

    public double squareRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Square root of negative values is not allowed");
        }
        return Math.sqrt(a);
    }
}