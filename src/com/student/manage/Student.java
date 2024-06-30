package com.student.manage;

public class Student {
	private int studentId;
	private String studentFirstName;
	private String studentSurName;
	private int age;
	public Student(int studentId, String studentFirstName, String studentSurName, int age) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentSurName = studentSurName;
		this.age = age;
	}
	public Student(String studentFirstName, String studentSurName, int age) {
		super();
		this.studentFirstName = studentFirstName;
		this.studentSurName = studentSurName;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentSurName() {
		return studentSurName;
	}
	public void setStudentSurName(String studentSurName) {
		this.studentSurName = studentSurName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentSurName="
				+ studentSurName + ", age=" + age + "]";
	}
	
	
}
