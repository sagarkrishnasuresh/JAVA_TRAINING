package com.example.comparatorvscomparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Charlie", 60000.0));
        employees.add(new Employee(1, "Alice", 75000.0));
        employees.add(new Employee(2, "Bob", 50000.0));

        //Lambda approach
        System.out.println("Sorted based on Name :");
        employees.sort((e1,e2) -> e1.getName().compareTo(e2.getName()));
        employees.forEach(System.out::println);

        System.out.println("Sorted based on salary :");
        employees.sort((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        employees.forEach(System.out::println);


        //Method Reference approach
        employees.sort(Comparator.comparing(Employee::getName));  // Sorting by Name
        employees.sort(Comparator.comparing(Employee::getSalary)); // Sorting by Salary




    }

}
