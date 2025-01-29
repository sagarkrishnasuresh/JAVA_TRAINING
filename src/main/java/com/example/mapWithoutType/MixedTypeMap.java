package com.example.mapWithoutType;

import java.util.*;

public class MixedTypeMap {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();

        map.put("name", "John");
        map.put("age", new Integer(25));
        map.put("salary", 55000.75);

        // No typecasting needed for printing
        System.out.println("Name: " + map.get("name"));
        System.out.println("Age: " + map.get("age"));
        System.out.println("Salary: " + map.get("salary"));
    }
}
