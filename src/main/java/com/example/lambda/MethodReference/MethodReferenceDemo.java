package com.example.lambda.MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using method reference
        names.forEach(System.out::println);

        // Equivalent Lambda
        names.forEach(name -> System.out.println(name));
    }
}

