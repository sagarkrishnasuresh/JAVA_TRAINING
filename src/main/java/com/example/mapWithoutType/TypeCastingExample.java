package com.example.mapWithoutType;


import java.util.*;

public class TypeCastingExample {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();

        map.put("name", "Bob");
        map.put("age", 30);

        // Typecasting needed for mathematical operations
        int age = (Integer) map.get("age");
        System.out.println("Next year, age will be: " + (age + 1)); // Works fine

        // Typecasting for string operations
        String name = (String) map.get("name");
        System.out.println("Uppercase Name: " + name.toUpperCase());
    }
}
