package com.example.maptypespecification;

import java.util.*;

public class RawTypeMapExample {
    public static void main(String[] args) {
        Map map = new HashMap(); // No generics used

        String name="arun";
        Map<String, String> nestedMap = new HashMap<>();
        nestedMap.put("name", name);
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, nestedMap); // Mixed types (String, Integer)

//        Map<Object, Object> map = new HashMap<>();
//        map.put(1, "One");
//        map.put(2, "Two");
//        map.put(3, 3); // Still mixed types but avoids raw type warnings

        // No need for typecasting when retrieving values
        System.out.println("Value at key 1: " + map.get(1));
        System.out.println("Value at key 2: " + map.get(2));
        System.out.println("Value at key 3: " + map.get(3));
        Object a =((Map)map.get(3)).get("name");
        System.out.print(a);
    }
}
