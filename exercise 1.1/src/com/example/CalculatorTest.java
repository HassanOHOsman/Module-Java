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
        assertEquals(10, calculator.add(5, 5), "Addition of 5 and 5 should equal 10");
    }

    @Test
    void testDivide() {
        assertEquals(20, calculator.divide(100, 5), "dividing 100 by 5 should equal 20");
    }

    @Test
    void testDivideByZeroThrows() {}
}