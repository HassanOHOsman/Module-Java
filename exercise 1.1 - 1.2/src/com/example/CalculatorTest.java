package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator =  new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(5, 5), "Addition of 2 values should equal the expected value");
    }

    @Test
    void testDivide() {
        assertEquals(20, calculator.divide(100, 5), "dividing value1 by value2 should equal the expected value");
    }

    @Test
    void testDivideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, ()-> calculator.divide(50, 0), "dividing by 0 should throw an exception");
    }
}