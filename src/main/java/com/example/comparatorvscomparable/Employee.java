package com.example.comparatorvscomparable;

import java.util.Comparator;

class Employee implements Comparable<Employee> {
    private int id;
    private String Name;
    private Double salary;

    public Employee(int id, String name, Double salary) {
        this.id = id;
        Name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public Double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", Name='" + Name + '\'' + ", salary=" + salary + '}';
    }


    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

}


