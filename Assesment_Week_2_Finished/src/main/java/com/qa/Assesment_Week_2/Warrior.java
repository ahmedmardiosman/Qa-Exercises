package com.qa.Assesment_Week_2;

public class Warrior extends Charecter {

	public Warrior(String charecterName, String charecterColour, int charecterAge, int charecterHeight) {
		super(charecterName, charecterColour, charecterAge, charecterHeight);
	}

	public void warriorCharecteristics() {
		System.out.println("Your warrior name is " + charecterName);
		System.out.println("Your warriors colour is " + charecterColour);
		System.out.println("Your warriors Age is " + charecterAge);
		System.out.println("Your warriors Height is " + charecterHeight + "cm \n");
	}

}
