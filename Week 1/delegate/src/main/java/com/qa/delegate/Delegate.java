package com.qa.delegate;

public class Delegate {
	
	public int techSkills;
	
	//constructors dont have return type
	
	
	private int softSkills;
	
	public String name;
	
	public Delegate(String name) {
		
		this.name = name;
				
	}
	
	public void remove() {
		
		System.out.println("Delegate was removed");
	}
	
	public void changeStream() {
		
		System.out.println("Delegate has changed Streams");
	}
	
	

}
