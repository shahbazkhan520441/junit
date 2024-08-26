package com.jsp.jsonpractice;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	int studentId;
	String studentName;
	int studentage;
	String studentAddress;
	
	public Student(int studentId, String studentName, int studentage, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentage = studentage;
		this.studentAddress = studentAddress;
	}
	
	public Student() {
		
	}


	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
