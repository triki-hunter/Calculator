package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(8, calculator.add(3, 5));
        assertNotEquals(8, calculator.add(3, 4));
    }

    @Test
    void subtract() {
        assertEquals(-8, calculator.subtract(10, 18));
        assertNotEquals(8, calculator.subtract(15, 5));
    }

    @Test
    void multiply() {
        assertEquals(27, calculator.multiply(3, 9));
        assertNotEquals(27, calculator.multiply(3, 8));
    }

    @Test
    void divide() throws DivideByZeroException {
        try {
            assertEquals(5, calculator.divide(20, 4));
        } catch (DivideByZeroException e) {
            throw new RuntimeException();
        }

        try {
            assertNotEquals(3, calculator.divide(4, 3));
        } catch (DivideByZeroException e) {
            throw new RuntimeException();
        }
        assertThrows(DivideByZeroException.class, () -> calculator.divide(12, 0));
    }
    @Test
    void squareRoot() {
        assertEquals(5.0, calculator.squareRoot(25.0), 0.0001);
        assertEquals(3.0, calculator.squareRoot(9.0), 0.0001);
        assertEquals(0.0, calculator.squareRoot(0.0), 0.0001);

        // Test negative numbers
        // Since the method returns NaN for negative inputs (and does not throw an exception), assert this behavior
        double result = calculator.squareRoot(-9.0);
        assertTrue(Double.isNaN(result), "Expected NaN for square root of a negative number.");
    }
}

