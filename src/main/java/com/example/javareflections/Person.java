package com.example.javareflections;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public Method
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    // Private Method
    private String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }
}
