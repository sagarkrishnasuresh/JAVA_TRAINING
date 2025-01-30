package com.example.exceptionhandling;

public class ThrowExample {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Not eligible to vote");
        }
        System.out.println("Eligible to vote.");
    }

    public static void main(String[] args) {
        checkAge(16); // This will throw an exception
    }
}

