package com.qa.Garage;

public class Motorcycle extends Vehicle {

	private int heightOfSeat;
	
	

	public Motorcycle(String brand, int numberOfWheels, int heightOfSeat) {
		super(brand, numberOfWheels);
		this.heightOfSeat = heightOfSeat;
		//
	}

	public int getheightOfSeat() {
		return heightOfSeat;
	}

	public void setHeightOfSeat(int heightOfSeat) {
		this.heightOfSeat = heightOfSeat;
	}

	public void wheeley() {

		System.out.println("You can wheeley your Motorcycle");

	}


}