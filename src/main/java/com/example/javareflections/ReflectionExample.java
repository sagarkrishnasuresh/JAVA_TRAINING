package com.example.javareflections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Create an object of the Person class
        Person person = new Person("Alice", 25);

        // 1. Get the Class object
        Class<?> personClass = person.getClass();

        // 2. Inspect Fields
        System.out.println("Fields:");
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(" - " + field.getName() + " (Type: " + field.getType() + ")");
        }

        // 3. Modify a Private Field
        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true); // Make private field accessible
        nameField.set(person, "Bob"); // Change the value of 'name'

        // 4. Call a Public Method
        System.out.println("\nCalling Public Method:");
        Method sayHelloMethod = personClass.getMethod("sayHello");
        sayHelloMethod.invoke(person); // Calls sayHello()

        // 5. Call a Private Method
        System.out.println("\nCalling Private Method:");
        Method getDetailsMethod = personClass.getDeclaredMethod("getDetails");
        getDetailsMethod.setAccessible(true); // Make private method accessible
        String details = (String) getDetailsMethod.invoke(person); // Call the method
        System.out.println(details);
    }
}
