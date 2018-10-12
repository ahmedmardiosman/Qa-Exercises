package com.qa.Assesment_Week_2;

public class Gangster extends Charecter {

	public Gangster( String charecterName, String charecterColour, int charecterAge, int charecterHeight) {
		super(charecterName, charecterColour, charecterAge, charecterHeight);
		
	}
	
	public void gangsterCharecteristics() {
		System.out.println("Your Gangsters name is " + charecterName);
		System.out.println("Your Gangsters colour is " + charecterColour);
		System.out.println("Your Gangsters Age is " + charecterAge);
		System.out.println("Your Gangsters Height is " + charecterHeight + "cm \n");
	}
	
	public void pistolWhip() {
		System.out.println();
	}
	
	
}
