# JSON Example Module

This module demonstrates how to handle **JSON to Object** and **Object to JSON** conversions in Java using three
different approaches:

1. **Map of Maps Approach**: Dynamically represent JSON using Java's `Map<String, Object>` for flexibility.
2. **Class Approach**: Use Plain Old Java Objects (POJOs) to create structured mappings for JSON, providing type safety
   and better readability.
3. **JSON Sorting**: Sort JSON data by specific fields using deserialization, Java's sorting utilities, and
   re-serialization.

---

## Folder Structure

### **mapOfMaps**

This folder contains examples of using a `Map<String, Object>` structure to represent and manipulate JSON data
dynamically.

#### Files:

1. **SimpleMapOfMapsExample.java**:
    - Demonstrates how to deserialize JSON into a `Map<String, Object>` and access nested data dynamically.
    - Shows how to create a nested `Map` structure in Java and serialize it into JSON.

2. **MapToJsonExample.java**:
    - Focuses on creating a `Map<String, Object>` with nested maps to represent JSON data.
    - Converts the map back into a JSON string using the Jackson library.

### **usingClass**

This folder contains examples of using dedicated Java classes (POJOs) to represent JSON structures for more type safety
and clarity.

#### Files:

1. **Person.java**:
    - Represents a simple POJO with fields like `name` and `age`.

2. **Address.java**:
    - Represents a nested POJO with fields like `city` and `zipCode`.

3. **JsonToObjectExample.java**:
    - Demonstrates deserializing a JSON string into a structured Java object (e.g., `Person`) using Jackson's
      `ObjectMapper`.

4. **ObjectToJsonExample.java**:
    - Shows how to serialize a Java object (e.g., `Person`) into a JSON string.

5. **NestedJsonExample.java**:
    - Combines `Person` and `Address` objects to represent nested JSON structures and demonstrates both serialization
      and deserialization.

### **jsonSorting**

This folder contains examples of sorting JSON data by specific fields using the Jackson library.

#### Files:

1. **JsonSortingExample.java**:
    - Demonstrates how to:
        - Deserialize JSON data into a list of Java objects (e.g., `List<Person>`).
        - Sort the list by a specific field (e.g., `age` or `name`) using `Comparator`.
        - Serialize the sorted list back into a JSON string.

---

## JSON to Object

### 1. **Map of Maps Approach**

- Flexible and dynamic way to handle JSON.
- Useful for prototyping or when the JSON structure is not predefined.

#### Example:

**JSON Input:**

```json
{
  "name": "Alice",
  "address": {
    "city": "New York",
    "zipCode": "10001"
  }
}
```

**Java Representation:**

```java
Map<String, Object> jsonMap = new HashMap<>();
jsonMap.put("name","Alice");

Map<String, Object> addressMap = new HashMap<>();
addressMap.put("city","New York");
addressMap.put("zipCode","10001");

jsonMap.put("address",addressMap);
```

### 2. **Class Approach**

- Uses structured Java classes (POJOs) to map JSON fields directly to Java fields.
- Provides type safety and easier manipulation of structured data.

#### Example:

**JSON Input:**

```json
{
  "name": "Alice",
  "age": 30,
  "address": {
    "city": "New York",
    "zipCode": "10001"
  }
}
```

**Java Representation:**

```java
class Person {
    private String name;
    private int age;
    private Address address;
    // Getters and setters
}

class Address {
    private String city;
    private String zipCode;
    // Getters and setters
}
```

---

## Object to JSON

### 1. **Map of Maps Approach**

- Dynamically construct a `Map` and serialize it to JSON.

#### Example:

```java
Map<String, Object> mainMap = new HashMap<>();
mainMap.put("name","Alice");
mainMap.put("age",30);

Map<String, Object> addressMap = new HashMap<>();
addressMap.put("city","New York");
addressMap.put("zipCode","10001");

mainMap.put("address",addressMap);

ObjectMapper objectMapper = new ObjectMapper();
String json = objectMapper.writeValueAsString(mainMap);
System.out.println(json);
```

**Output:**

```json
{
  "name": "Alice",
  "age": 30,
  "address": {
    "city": "New York",
    "zipCode": "10001"
  }
}
```

### 2. **Class Approach**

- Create an object and serialize it into JSON.

#### Example:

```java
Person person = new Person();
person.setName("Alice");
person.setAge(30);

Address address = new Address();
address.setCity("New York");
address.setZipCode("10001");

person.setAddress(address);

ObjectMapper objectMapper = new ObjectMapper();
String json = objectMapper.writeValueAsString(person);
System.out.println(json);
```

**Output:**

```json
{
  "name": "Alice",
  "age": 30,
  "address": {
    "city": "New York",
    "zipCode": "10001"
  }
}
```

---

## JSON Sorting

### **Approach**

1. **Deserialize JSON to Java Objects**:
    - Convert JSON into a list of structured Java objects (e.g., `List<Person>`).
2. **Sort the List**:
    - Use Java's `Comparator` to sort the list based on a specific field.
3. **Serialize Back to JSON**:
    - Convert the sorted list of objects back into a JSON string.

#### Example:

**Input JSON:**

```json
[
  {
    "name": "John",
    "age": 30
  },
  {
    "name": "Alice",
    "age": 25
  },
  {
    "name": "Bob",
    "age": 35
  }
]
```

**Java Code:**

```java
ObjectMapper objectMapper = new ObjectMapper();

// Deserialize JSON into List<Person>
List<Person> personList = objectMapper.readValue(jsonData, new TypeReference<List<Person>>() {
});

// Sort the List by Age
personList.sort(Comparator.comparingInt(p ->p.age));

// Serialize the sorted list back to JSON
String sortedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(personList);

System.out.println("Sorted JSON:\n"+sortedJson);
```

**Output JSON:**

```json
[
  {
    "name": "Alice",
    "age": 25
  },
  {
    "name": "John",
    "age": 30
  },
  {
    "name": "Bob",
    "age": 35
  }
]
```

---

## Key Points

### **Map of Maps Approach**

- **Advantages**:
    - No need to define Java classes.
    - Useful for dynamic or unknown JSON structures.
- **Disadvantages**:
    - Requires typecasting for nested objects.
    - Less readable and harder to manage for complex data.

### **Class Approach**

- **Advantages**:
    - Provides type safety and better readability.
    - Easier to work with and maintain.
- **Disadvantages**:
    - Requires defining Java classes for JSON structure.

### **JSON Sorting**

- **Advantages**:
    - Allows structured sorting of JSON data.
    - Can handle sorting by multiple fields using custom `Comparator` logic.
- **Disadvantages**:
    - Requires deserialization and serialization steps.

---

Feel free to explore the examples provided in the `jsonExample` folder to deepen your understanding of JSON handling in
Java!

