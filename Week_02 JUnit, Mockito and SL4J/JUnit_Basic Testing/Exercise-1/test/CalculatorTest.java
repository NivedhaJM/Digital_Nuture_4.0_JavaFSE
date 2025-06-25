package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

	 @Test
	    public void testAdd() {
	        Calculator calc = new Calculator();
	        assertEquals(10, calc.add(6, 4));
	    }

	    @Test
	    public void testSubtract() {
	        Calculator calc = new Calculator();
	        assertEquals(2, calc.subtract(6, 4));
	    }
}
