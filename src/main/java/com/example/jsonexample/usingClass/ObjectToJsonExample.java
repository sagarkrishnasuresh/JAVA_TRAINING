package com.example.jsonexample.usingClass;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJsonExample {
    public static void main(String[] args) throws Exception {

        Person person = new Person("Alice", 25 );
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(person);

        System.out.println("JSON Representation:" + json);



    }


}
