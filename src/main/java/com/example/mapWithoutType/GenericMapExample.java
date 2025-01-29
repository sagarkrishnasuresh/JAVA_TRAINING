package com.example.mapWithoutType;

import java.util.*;

public class GenericMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(); // Ensures type safety

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // No typecasting required
        System.out.println("Value at key 1: " + map.get(1));
        System.out.println("Value at key 2: " + map.get(2));
        System.out.println("Value at key 3: " + map.get(3));
    }
}
