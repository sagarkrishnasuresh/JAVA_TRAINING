# Java Reflections

## Overview
**Java Reflection** is a powerful feature that allows a program to inspect and manipulate its own structure at runtime. Using Reflection, you can:
- Access fields (variables), methods, and constructors of a class, even if they are private.
- Dynamically invoke methods or modify fields.
- Inspect class details such as its methods, fields, and constructors.

---

## Why Use Java Reflection?
Reflection is used in various scenarios, including:
1. **Frameworks**: Popular frameworks like Spring and Hibernate use Reflection for dependency injection and object manipulation.
2. **Debugging and Testing**: Access and modify private fields or methods for testing purposes.
3. **Dynamic Behavior**: Analyze objects or modify them at runtime when the class structure is unknown at compile time.

---

## Key Concepts in Java Reflection
Reflection works with the following classes from the `java.lang.reflect` package:
1. **`Class`**: Represents a class or interface.
2. **`Field`**: Represents a field (variable) in a class.
3. **`Method`**: Represents a method in a class.
4. **`Constructor`**: Represents a constructor in a class.

---

## Example: Java Reflection in Action

### 1. The Class to Reflect On
```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    private String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }
}
```

### 2. Using Reflection
Here’s how we can use Reflection to inspect and manipulate the `Person` class:
```java
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Step 1: Create an instance of the Person class
        Person person = new Person("Alice", 25);

        // Step 2: Get the Class object
        Class<?> personClass = person.getClass();

        // Step 3: Inspect Fields
        System.out.println("Fields:");
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(" - " + field.getName() + " (Type: " + field.getType() + ")");
        }

        // Step 4: Modify a Private Field
        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true); // Make private field accessible
        nameField.set(person, "Bob"); // Change the name to "Bob"

        // Step 5: Call a Public Method
        System.out.println("\nCalling Public Method:");
        Method sayHelloMethod = personClass.getMethod("sayHello");
        sayHelloMethod.invoke(person); // Calls sayHello()

        // Step 6: Call a Private Method
        System.out.println("\nCalling Private Method:");
        Method getDetailsMethod = personClass.getDeclaredMethod("getDetails");
        getDetailsMethod.setAccessible(true); // Make private method accessible
        String details = (String) getDetailsMethod.invoke(person);
        System.out.println(details);
    }
}
```

### Output
```
Fields:
 - name (Type: class java.lang.String)
 - age (Type: int)

Calling Public Method:
Hello, my name is Bob

Calling Private Method:
Name: Bob, Age: 25
```

---

## Key Methods in Reflection

### 1. **Working with Fields**
- Use `Field` to inspect and modify class fields.
- Common methods:

| **Method**               | **Purpose**                                         |
|--------------------------|-----------------------------------------------------|
| `getDeclaredFields()`    | Gets all fields, including private fields.          |
| `getDeclaredField(name)` | Gets a specific field by name.                      |
| `setAccessible(true)`    | Allows access to private fields.                    |
| `set(Object obj, value)` | Modifies the value of a field.                      |

Example:
```java
Field nameField = personClass.getDeclaredField("name");
nameField.setAccessible(true);
nameField.set(person, "Bob");
```

### 2. **Working with Methods**
- Use `Method` to inspect and invoke class methods.
- Common methods:

| **Method**               | **Purpose**                                         |
|--------------------------|-----------------------------------------------------|
| `getMethods()`           | Gets all public methods (including inherited).      |
| `getDeclaredMethods()`   | Gets all methods, including private.                |
| `invoke(Object obj, args)`| Invokes a method on an object.                     |

Example:
```java
Method sayHelloMethod = personClass.getMethod("sayHello");
sayHelloMethod.invoke(person);
```

---

## Advantages of Java Reflection
1. **Access Private Members**: Allows access to private fields or methods for debugging or testing.
2. **Dynamic Behavior**: Enables modifying or analyzing objects at runtime.
3. **Framework Development**: Essential for creating frameworks (e.g., Spring, Hibernate).

---

## Disadvantages of Java Reflection
1. **Performance Overhead**: Reflection is slower compared to direct method calls.
2. **Encapsulation Violation**: Breaks the principle of encapsulation by accessing private members.
3. **Complexity**: Makes code harder to understand and maintain.

---

## Key Points to Remember
- Reflection is powerful but should be used sparingly.
- Always ensure proper permissions (e.g., `setAccessible(true)`).
- Avoid using Reflection unnecessarily, as it can lead to performance issues and security risks.

---

## Further Reading
- [Java Reflection Documentation](https://docs.oracle.com/javase/tutorial/reflect/)
- [Oracle Reflection API](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/package-summary.html)

---

Happy Coding! 😊

