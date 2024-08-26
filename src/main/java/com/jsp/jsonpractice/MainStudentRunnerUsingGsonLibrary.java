package com.jsp.jsonpractice;

import com.google.gson.Gson;

public class MainStudentRunnerUsingGsonLibrary
{

    public static void main(String[] args) {
        // Creating a Student object
        Student std = new Student(1, "Shahbaz", 23, "Bidar");

        // Using Gson to convert Java object to JSON string
        Gson gson = new Gson();
        
        // Encode Student object to JSON string
        String jsonString = gson.toJson(std);
        System.out.println("Encoded JSON: " + jsonString);

        // Decode JSON string back to Student object
        Student decodedStudent = gson.fromJson(jsonString, Student.class);

        // Printing the student data
        System.out.println("Decoded Student:");
        System.out.println("ID: " + decodedStudent.getStudentId());
        System.out.println("Name: " + decodedStudent.getStudentName());
        System.out.println("Age: " + decodedStudent.getStudentage());
        System.out.println("Address: " + decodedStudent.getStudentAddress());
    }
}

