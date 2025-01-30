# Understanding Different Ways of Type Specification for `Map` in Java

## Introduction
This repository contains multiple examples demonstrating different ways of specifying types for a `Map` in Java. These examples illustrate type safety, handling mixed types, using lists within a map, and working with raw types.

## Overview of Classes

### 1. `GenericMapExample`
This class demonstrates the use of generics for type safety in a `Map`.
```java
Map<Integer, String> map = new HashMap<>();
```
- Ensures that the keys are always `Integer`.
- Ensures that the values are always `String`.
- Prevents typecasting issues and runtime errors.

### 2. `MapWithList`
This class demonstrates storing lists as values inside a `Map`.
```java
Map<Integer, List<String>> map = new HashMap<>();
```
- The keys are `Integer`.
- The values are `List<String>`, making it easy to group related elements.
- Example usage includes categorizing fruits and animals.

### 3. `MixedTypeMap`
This class uses `Map<String, Object>` to allow storing different types of values.
```java
Map<String, Object> map = new HashMap<>();
```
- The keys are `String`.
- The values can be of any type (`Object`), allowing mixed-type storage.
- Used for dynamic structures like JSON-like data.
- Typecasting is required when retrieving values for specific operations.

### 4. `RawTypeMapExample`
This class demonstrates a raw `Map` (without generics), which lacks type safety.
```java
Map map = new HashMap();
```
- The map can store mixed types without compilation errors.
- Can lead to `ClassCastException` at runtime.
- Example includes storing `String` and `Integer` values in the same map.

### 5. `TypeCastingExample`
This class highlights the necessity of typecasting when using `Map<String, Object>`.
```java
int age = (Integer) map.get("age");
```
- Typecasting is needed for mathematical operations.
- Demonstrates converting `Object` values back to their expected types.
- Prevents runtime errors when working with dynamic types.

## Conclusion
This collection of examples provides a solid understanding of different ways to specify types in `Map`:
- **Use generics** (`Map<Integer, String>`) for **type safety**.
- **Use `Map<Integer, List<String>>`** to store lists inside a map.
- **Use `Map<String, Object>`** when handling mixed-type values dynamically.
- **Avoid raw types** (`Map map = new HashMap()`) as they introduce potential runtime errors.
- **Always use typecasting** when retrieving values from `Map<String, Object>` for operations.

These examples will help you choose the appropriate `Map` type based on your use case!

