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
}
