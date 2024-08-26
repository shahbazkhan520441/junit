package com.jsp.jsonpractice;

import org.json.JSONObject;

public class MainStudentRunnerUsingJsonLibrary {

    public static void main(String[] args) {
        // Creating a Student object
        Student std = new Student(1, "Shahbaz", 23, "Bidar");

        // Encoding the Student object to JSON using org.json library
        JSONObject jo = new JSONObject();
        jo.put("studentId", std.getStudentId());
        jo.put("studentName", std.getStudentName());
        jo.put("studentAge", std.getStudentage());
        jo.put("studentAddress", std.getStudentAddress());

        System.out.println("Encoded JSON: " + jo);

        // Decoding the JSON string back to a Student object using org.json library
        String json = jo.toString();
        
        // Parsing JSON back to an object
        JSONObject parsedJson = new JSONObject(json);

        // Mapping the parsed JSON object back to a Student object
        Student student = new Student(
                parsedJson.getInt("studentId"),
                parsedJson.getString("studentName"),
                parsedJson.getInt("studentAge"),
                parsedJson.getString("studentAddress")
        );

        // Printing the student data
        System.out.println("Decoded Student:");
        System.out.println("ID: " + student.getStudentId());
        System.out.println("Name: " + student.getStudentName());
        System.out.println("Age: " + student.getStudentage());
        System.out.println("Address: " + student.getStudentAddress());
    }
}
