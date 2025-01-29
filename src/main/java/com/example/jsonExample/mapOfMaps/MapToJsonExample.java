package com.example.jsonExample.mapOfMaps;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class MapToJsonExample {
    public static void main(String[] args) throws Exception {
        // Step 1: Create a nested map for "address"
        Map<String, Object> addressMap = new HashMap<>();
        addressMap.put("city", "New York");
        addressMap.put("zipCode", "10001");

        // Step 2: Create the main map
        Map<String, Object> mainMap = new HashMap<>();
        mainMap.put("name", "Alice");
        mainMap.put("address", addressMap);

        System.out.println("addressMap : " + addressMap);
        System.out.println("mainMap : " + mainMap);

        // Step 3: Convert Map to JSON using ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(mainMap);

        // Step 4: Print the JSON string
        System.out.println("Generated JSON: " + json);
    }
}
