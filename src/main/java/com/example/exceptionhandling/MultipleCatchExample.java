package com.example.exceptionhandling;

import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int arr[] = new int[5];
            System.out.println("Enter the elements :");
            for (int i = 0; i < 5; i++) {
                arr[i + 5] = scanner.nextInt(); // Array index out of bound
                arr[i] = 30/0; //Arithmetic exception
            }

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds : " + e.getMessage());
        }
    }

}
