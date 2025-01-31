package com.example.exercises.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentDatabase {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "John");
        students.put(102, "Emma");
        students.put(103, "Sophia");

        students.put(102, "Johny");

        students.remove(103);

        Set<Map.Entry<Integer, String>> s= students.entrySet();
        System.out.println(s);


    }


}
