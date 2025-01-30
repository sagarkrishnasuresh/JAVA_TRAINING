package com.example.comparatorvscomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Charlie", 60000.0));
        employees.add(new Employee(1, "Alice", 75000.0));
        employees.add(new Employee(2, "Bob", 50000.0));

        System.out.println("Employee list before sorting:");
        employees.forEach(System.out::println);

        System.out.println("After Sorting (Salary based) :");
        employees.sort(new SalaryComparator());
//        Collections.sort(employees, new SalaryComparator()); //older approach
        employees.forEach(System.out::println);

        System.out.println("After Sorting (Name based) :");
        employees.sort(new NameComparator());
//        Collections.sort(employees, new NameComparator()); //older approach
        employees.forEach(System.out::println);


    }

}
