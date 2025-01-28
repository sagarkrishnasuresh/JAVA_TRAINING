package com.example.lambda;



public class LambdaExample {
    public static void main(String[] args) {
        SquareCalculator square = (number) -> number * number;
        int n = 13;
        int result = square.calculateSquare(n);
        System.out.println("The square of " + n + " is: " + result);
    }

}