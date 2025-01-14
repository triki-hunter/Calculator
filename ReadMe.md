# Calculator Class

## Overview
A simple calculator with basic math functions.

## Methods

### `add(int a, int b)`
Adds two numbers.

### `subtract(int a, int b)`
Subtracts the second number from the first.

### `multiply(int a, int b)`
Multiplies two numbers.

### `divide(int a, int b)`
Divides `a` by `b`. Throws an error if `b` is 0.

## Example
```java
Calculator c = new Calculator();
System.out.println(c.add(5, 3)); // 8~~~~
System.out.println(c.subtract(10, 4)); // 6
System.out.println(c.multiply(6, 7)); // 42
try {
    System.out.println(c.divide(8, 2)); // 4
} catch (Exception e) {
    System.out.println("Can't divide by zero");
}
```

## Notes
- Handles integers only.

![Test Status](https://github.com/triki-hunter/Calculator/actions/workflows/ci.yml/badge.svg)


