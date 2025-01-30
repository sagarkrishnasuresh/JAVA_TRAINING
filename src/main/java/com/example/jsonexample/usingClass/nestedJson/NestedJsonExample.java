package com.example.jsonexample.usingClass.nestedJson;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NestedJsonExample {
    public static void main(String[] args) throws Exception {
        // JSON string with nested structure
        String json = "{\"name\":\"Alice\",\"age\":25,\"address\":{\"city\":\"New York\",\"zipCode\":\"10001\"}}";

        // Convert JSON to Person object
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(json, Person.class);

        // Print Person object
        System.out.println("Person Object: " + person);
    }
}
