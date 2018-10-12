package com.qa.Week_2_Assesment;

public class Princess extends Charecter{

	public Princess( String charecterName, String charecterColour, int charecterAge, int charecterHeight) {
		super(charecterName, charecterColour, charecterAge, charecterHeight);
	}
	
	public void princessCharecteristics() {
		System.out.println("Your princessess name is " + charecterName);
		System.out.println("Your princessess colour is " + charecterColour);
		System.out.println("Your princessess Age is " + charecterAge);
		System.out.println("Your princessess Height is " + charecterHeight + " cm \n");
	}
	

}
