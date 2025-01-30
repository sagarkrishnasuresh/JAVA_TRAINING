# Comparable vs Comparator in Java

## Overview
This project demonstrates the difference between `Comparable` and `Comparator` in Java with step-by-step examples, including sorting objects using both approaches.

## What You Will Learn
- How to use `Comparable` for natural ordering.
- How to use `Comparator` for custom sorting.
- Differences between `Comparable` and `Comparator`.
- Implementing sorting using lambda expressions and method references.
- Understanding `compareTo()`, `compare()`, and `Comparator.comparing()`.
- Difference between `Collections.sort()` and `List.sort()`.

## Project Structure
```
├── src
│   ├── Employee.java
│   ├── ComparableExample.java
│   ├── ComparatorExample.java
│   ├── LambdaComparatorExample.java
│   ├── NameComparator.java
│   ├── SalaryComparator.java
│   └── README.md
```

## 1. Implementing `Comparable`
### **Sorting by ID (Natural Order)**
The `Employee` class implements `Comparable` to define a **default sorting order** by ID.

```java
class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }
}
```

### **Sorting Employees using Comparable**
```java
Collections.sort(employees); // Uses compareTo() method (Sorts by ID)
```

## 2. Implementing `Comparator`
### **Sorting by Name and Salary**
We create custom comparators for sorting employees by name and salary.

#### **Sorting by Name**
```java
class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
```

#### **Sorting by Salary**
```java
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}
```

### **Using Comparators for Sorting**
```java
Collections.sort(employees, new NameComparator()); // Sort by Name
Collections.sort(employees, new SalaryComparator()); // Sort by Salary
```

## 3. Using Lambda Expressions & Method References
We simplify sorting using **lambda expressions** and **method references**.

### **Lambda Approach**
```java
employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
```

### **Method Reference Approach**
```java
employees.sort(Comparator.comparing(Employee::getName)); // Sort by Name
employees.sort(Comparator.comparing(Employee::getSalary)); // Sort by Salary
```

## Key Differences
| Feature | `Comparable` | `Comparator` |
|---------|------------|------------|
| **Interface** | `java.lang.Comparable<T>` | `java.util.Comparator<T>` |
| **Method** | `compareTo(T o)` | `compare(T o1, T o2)` |
| **Implementation** | Inside the class | Outside the class |
| **Modifies Class?** | Yes | No |
| **Sorting Order** | Single (Natural Order) | Multiple (Custom Order) |
| **Example Usage** | `Collections.sort(list);` | `Collections.sort(list, comparator);` |

## Understanding `compareTo()`, `compare()`, and `Comparator.comparing()`
| Method | Used in | Purpose | Example |
|--------|--------|---------|---------|
| `compareTo()` | `Comparable` | Defines natural ordering inside the class | `e1.getName().compareTo(e2.getName())` |
| `compare()` | `Comparator` | Defines custom sorting outside the class | `Integer.compare(e1.getId(), e2.getId())` |
| `Comparator.comparing()` | `Comparator` | Shortcut for creating a comparator | `Comparator.comparing(Employee::getName)` |

## Why is `compareTo()` Used in `Comparator`?
Even when using `Comparator`, we often compare fields that implement `Comparable`, such as `String` and `Integer`. That’s why `compareTo()` appears in comparator logic.
```java
Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
```
Here, `e1.getName()` returns a `String`, which implements `Comparable<String>`, so we can use `compareTo()`.

## Collections.sort() vs List.sort()
| Method | Description | Example |
|--------|-------------|---------|
| `Collections.sort()` | Static method that sorts a list using `Comparable` or `Comparator` | `Collections.sort(list, comparator);` |
| `List.sort()` | Default method of `List` (Java 8+) that sorts the list directly | `list.sort(comparator);` |

**Recommended Approach:** Use `list.sort()` in Java 8+ for better readability and performance.
```java
employeeList.sort(Comparator.comparing(Employee::getName));
```

## When to Use Which?
✅ **Use `Comparable` when:**
- The class has **one natural sorting order** (e.g., sorting employees by ID).

✅ **Use `Comparator` when:**
- **Multiple sorting orders** are required (e.g., sorting employees by name or salary).
- You don’t want to modify the original class.
- You need **custom sorting logic**.



🚀 **Happy Coding!**

