package com.jsp.jsonpractice;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainStudentRunnerUsingJackson {

    public static void main(String[] args) {
        // Creating a Student object
        Student std = new Student(1, "Shahbaz", 23, "Bidar");

        // Using Jackson ObjectMapper to convert Java object to JSON string
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Encode Student object to JSON string
            String jsonString = objectMapper.writeValueAsString(std);
            System.out.println("Encoded JSON: " + jsonString);

            // Decode JSON string back to Student object
            Student decodedStudent = objectMapper.readValue(jsonString, Student.class);

            // Printing the student data
            System.out.println("Decoded Student:");
            System.out.println("ID: " + decodedStudent.getStudentId());
            System.out.println("Name: " + decodedStudent.getStudentName());
            System.out.println("Age: " + decodedStudent.getStudentage());
            System.out.println("Address: " + decodedStudent.getStudentAddress());

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
