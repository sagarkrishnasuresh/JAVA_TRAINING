# Lambda Expressions in Java

This repository contains a simple example to demonstrate the concept of **lambda expressions** in Java. It provides a step-by-step implementation of a functional interface and the usage of lambda expressions.

## 📖 What is a Lambda Expression?

A **lambda expression** is a concise way to represent a method in a functional interface. It allows you to write shorter and cleaner code, especially for single-method interfaces.

### Key Features of Lambda Expressions:
- Eliminates boilerplate code.
- Simplifies functional programming in Java.
- Works with interfaces annotated with `@FunctionalInterface`.

---

## 🛠️ Functional Interface in This Example

The example uses a functional interface `SquareCalculator`:
```java
@FunctionalInterface
interface SquareCalculator {
    int calculateSquare(int number);
}