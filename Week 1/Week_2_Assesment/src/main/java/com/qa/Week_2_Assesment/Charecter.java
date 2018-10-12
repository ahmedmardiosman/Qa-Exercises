package com.qa.Week_2_Assesment;

public abstract class Charecter {
	
	String charecterName;
	String charecterColour;
	int charecterAge;
	int charecterHeight;
	
	//x
	
	
	//y
	
	
	
	public Charecter(String charecterName, String charecterColour, int charecterAge, int charecterHeight ) {
		this.charecterName = charecterName;
		this.charecterColour = charecterColour;
		this.charecterAge = charecterAge;
		this.charecterHeight = charecterHeight;
	}
	
	
	public void fly() {
		System.out.println(charecterName + " is Flying... ");
	}
	
	
	public void driving() {
		System.out.println( charecterName +  " is driving... ");
	}
	

	public void walking() {
		System.out.println(charecterName + " is walking...");
	}
	
}
