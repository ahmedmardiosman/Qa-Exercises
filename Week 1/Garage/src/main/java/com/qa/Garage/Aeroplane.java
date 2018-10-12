package com.qa.Garage;

public class Aeroplane extends Vehicle {

	private int numberOfSeats;

	

	public Aeroplane(String brand, int numberOfWheels, int numberOfSeats) {
		super(brand, numberOfWheels);
		this.setNumberOfSeats(numberOfSeats);
	}

	public void flies() {

		System.out.println("You are flying the aeroplane");
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	

}
