package com.encapsulation;

public class Teacher {

	private int ID;
	private String name;
	private String subject;
	private int age;
	
	public Teacher(int iD, String name, String subject, int age) {
		super();
		ID = iD;
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [ID=" + ID + ", name=" + name + ", subject=" + subject + ", age=" + age + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
