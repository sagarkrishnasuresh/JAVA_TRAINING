package com.example.javaReflections;

public class Cat {

    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow() {
        System.out.println("Meow");
    }

    private void heyThisIsPrivate() {
        System.out.println("How did you call this??");
    }

    public static void thisIsPublicStaticMethod() {
        System.out.println("I am public and static!");
    }

    private static void thisIsPrivateStaticMethod() {
        System.out.println("I am private and static!");
    }


}