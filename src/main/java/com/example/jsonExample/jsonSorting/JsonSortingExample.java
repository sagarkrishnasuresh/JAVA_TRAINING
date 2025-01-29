package com.example.jsonExample.jsonSorting;

import com.example.jsonExample.usingClass.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Comparator;
import java.util.List;

public class JsonSortingExample {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonData = "[{\"name\": \"John\", \"age\": 30}, " +
                "{\"name\": \"Alice\", \"age\": 25}, " +
                "{\"name\": \"Bob\", \"age\": 35}]";

        System.out.println(jsonData);

        ObjectMapper objectMapper = new ObjectMapper();
        List<Person> personList = objectMapper.readValue(jsonData, new TypeReference<List<Person>>() {});

        System.out.println(personList); //list of person objects

        personList.sort(Comparator.comparingInt(Person::getAge));

        System.out.println(personList); //sorted list of person objects


        String sortedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(personList);

        System.out.println("Sorted JSON:\n" + sortedJson); // sorted json data

    }
}
