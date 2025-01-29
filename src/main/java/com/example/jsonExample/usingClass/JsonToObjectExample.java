package com.example.jsonExample.usingClass;


import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObjectExample {
    public static void main(String[] args) throws Exception {
        String json = "{\"name\":\"Bob\",\"age\":30}";
        System.out.println("JSON is : " + json);

        ObjectMapper objectMapper = new ObjectMapper();

        Person person = objectMapper.readValue(json, Person.class );

        System.out.println("Person Object : " + person);


    }
}
