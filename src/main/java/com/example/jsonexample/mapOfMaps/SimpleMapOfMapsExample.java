package com.example.jsonexample.mapOfMaps;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class SimpleMapOfMapsExample {
    public static void main(String[] args) throws Exception {
        // JSON string
        String json = """
                {
                  "name": "Alice",
                  "address": {
                    "city": "New York",
                    "zipCode": "10001"
                  }
                }
                """;

        // Step 1: Create ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // Step 2: Convert JSON to Map<String, Object>
        Map<String, Object> jsonMap = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {});

        // Step 3: Print the entire map
        System.out.println("JSON as Map: " + jsonMap);

        // Step 4: Access nested data (address)
        Map<String, Object> addressMap = (Map<String, Object>) jsonMap.get("address");
        System.out.println("City: " + addressMap.get("city"));
        System.out.println("Zip Code: " + addressMap.get("zipCode"));
    }
}
