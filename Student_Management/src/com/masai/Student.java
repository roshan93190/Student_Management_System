package com.masai;

public class Student {

	private int studentId;
	private String studentName;
	private String studentPhoneNumber;
	private String studentCity;
	
	public Student(int studentId, String studentName, String studentPhoneNumber, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhoneNumber = studentPhoneNumber;
		this.studentCity = studentCity;
	}

	public Student(String studentName, String studentPhoneNumber, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentPhoneNumber = studentPhoneNumber;
		this.studentCity = studentCity;
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

	public String getStudentPhoneNumber() {
		return studentPhoneNumber;
	}

	public void setStudentPhoneNumber(String studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	 public Student() {
		 
	 };
}
