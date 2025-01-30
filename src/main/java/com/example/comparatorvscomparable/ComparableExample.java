package com.example.comparatorvscomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Charlie", 60000.0));
        employees.add(new Employee(1, "Alice", 75000.0));
        employees.add(new Employee(2, "Bob", 50000.0));

        System.out.println("Employee list before sorting:");
        employees.forEach(System.out::println);

        Collections.sort(employees);

        System.out.println("After sorting:");
        employees.forEach(System.out::println);


    }
}
