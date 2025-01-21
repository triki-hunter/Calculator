package org.example;

public class Calculator {
    //add
    public int add(int a, int b) {
        return a + b;
    }

    //subtract
    public int subtract(int a, int b) {
        return a - b;
    }

    //multiply
    public int multiply(int a, int b) {
        return a * b;
    }

    //divide
    public int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException();
        }
        return a / b;
    }

    // calculate square root
    public double squareRoot(double a)  {
        if (a < 0) {
            System.out.println("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(a);
    }
    // calculate power
    public double powerOf(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
