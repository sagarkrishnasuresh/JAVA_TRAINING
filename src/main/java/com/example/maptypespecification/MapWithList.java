package com.example.maptypespecification;

import java.util.*;

public class MapWithList {
    public static void main(String[] args) {
        Map<Integer, List<String>> map = new HashMap<>();

        map.put(1, Arrays.asList("Apple", "Banana", "Cherry"));
        map.put(2, Arrays.asList("Dog", "Cat", "Elephant"));

        System.out.println("Fruits: " + map.get(1));
        System.out.println("Animals: " + map.get(2));
    }
}
