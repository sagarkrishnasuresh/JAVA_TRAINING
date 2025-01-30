package com.example.exceptionhandling;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
