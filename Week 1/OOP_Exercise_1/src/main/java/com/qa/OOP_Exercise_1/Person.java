package com.qa.OOP_Exercise_1;

public class Person {
	
	public String name;
	
	public int age;
	
	public String jobTitle;
	
	public Person (String name, int age, String jobTitle) {
		
		this.name = name;
		
		this.age = age;
		
		this.jobTitle = jobTitle;
		
		
	}
	
	@Override
	public String toString() {
		
	return name + " " + age + " " + jobTitle;
	}
	
	

	
	
	

}
