package com.example.mapWithoutType;

import java.util.*;

public class RawTypeMapExample {
    public static void main(String[] args) {
        Map<Integer , Integer> map = new HashMap(); // No generics used

//        map.put(1, "One");
//        map.put(2, "Two");
        map.put(3, 3); // Mixed types (String, Integer)

//        Map<Object, Object> map = new HashMap<>();
//        map.put(1, "One");
//        map.put(2, "Two");
//        map.put(3, 3); // Still mixed types but avoids raw type warnings

        // No need for typecasting when retrieving values
        System.out.println("Value at key 1: " + map.get(1));
        int sum = map.get(3) +5;
        System.out.println(sum);
        System.out.println("Value at key 2: " + map.get(2));
        System.out.println("Value at key 3: " + map.get(3));
    }
}
