package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete.");
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete.");
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 5);
        assertEquals(20, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }
}
