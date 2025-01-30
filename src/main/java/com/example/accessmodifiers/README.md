# Access Modifiers in Java

This repository contains a simple and beginner-friendly tutorial on **Access Modifiers in Java**. Access modifiers determine the scope and accessibility of classes, methods, and variables in Java. They play a crucial role in encapsulation, which is a fundamental concept of Object-Oriented Programming (OOP).

## Types of Access Modifiers in Java

1. **Public**  
   - Accessible from any other class.
   - Example:
     ```java
     public class PublicClass {
         public void display() {
             System.out.println("This is a public method.");
         }
     }
     ```

2. **Private**  
   - Accessible only within the same class.
   - Example:
     ```java
     public class PrivateClass {
         private void display() {
             System.out.println("This is a private method.");
         }
     }
     ```

3. **Protected**  
   - Accessible within the same package and by subclasses in other packages.
   - Example:
     ```java
     public class ProtectedClass {
         protected void display() {
             System.out.println("This is a protected method.");
         }
     }
     ```

4. **Default (No Modifier)**  
   - Accessible only within the same package.
   - Example:
     ```java
     class DefaultClass {
         void display() {
             System.out.println("This is a default method.");
         }
     }
     ```

## Repository Structure

- **Code Examples**: Contains practical examples for each type of access modifier.
