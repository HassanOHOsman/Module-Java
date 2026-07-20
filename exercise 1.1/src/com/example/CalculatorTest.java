package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.\*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator =  new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(5, 5), "Addition of 2 values should return the expected value");
    }

    @Test
    void testDivide() {}

    @Test
    void testDivideByZeroThrows() {}
}