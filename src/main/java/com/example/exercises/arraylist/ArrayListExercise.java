package com.example.exercises.arraylist;

import java.util.*;

public class ArrayListExercise {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Alice");
        names.add("Ali");

        names.remove("Ali");    //removing element

        for (String i : names) {
            System.out.println(i);  // printing all the elements
        }

        System.out.println("Contains Alice ? :\n " + names.contains("Alice"));  //checking if an element exist in list
    }

}
