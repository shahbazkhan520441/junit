package com.jsp.jsonpractice;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MainStudentRunnerUsingJsonSimpleLibrary
{

    public static void main(String[] args) {
        // Creating a Student object
        Student std = new Student(1, "Shahbaz", 23, "Bidar");

        // Encoding the Student object to JSON using org.json.simple library
        JSONObject jo = new JSONObject();
        jo.put("studentId", std.getStudentId());
        jo.put("studentName", std.getStudentName());
        jo.put("studentAge", std.getStudentage());
        jo.put("studentAddress", std.getStudentAddress());

        System.out.println("Encoded JSON: " + jo);

        // Decoding the JSON string back to a Student object using org.json.simple library
        String json = jo.toJSONString();

        JSONParser parser = new JSONParser();
        try {
            // Parsing JSON back to an object
            JSONObject parsedJson = (JSONObject) parser.parse(json);

            // Mapping the parsed JSON object back to a Student object
            Student student = new Student(
                    ((Long) parsedJson.get("studentId")).intValue(),
                    (String) parsedJson.get("studentName"),
                    ((Long) parsedJson.get("studentAge")).intValue(),
                    (String) parsedJson.get("studentAddress")
            );

            // Printing the student data
            System.out.println("Decoded Student:");
            System.out.println("ID: " + student.getStudentId());
            System.out.println("Name: " + student.getStudentName());
            System.out.println("Age: " + student.getStudentage());
            System.out.println("Address: " + student.getStudentAddress());

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
