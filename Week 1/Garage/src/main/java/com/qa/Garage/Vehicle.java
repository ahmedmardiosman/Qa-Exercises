package com.qa.Garage;

public abstract class Vehicle {

	private String brand;
	int numberOfWheels;
	private int priceOfVehicle;

	public Vehicle(String brand, int numberOfWheels) {

		this.setBrand(brand);
		this.numberOfWheels = numberOfWheels;

	}

	public void sitDown() {

		System.out.println("You can sit down in your Vehicle");
	}

	public void playMusic() {
		System.out.println("You can play music in the Vehicle");
	}

	public int getPriceOfVehicle() {
		return priceOfVehicle;
	}

	public void setPriceOfVehicle(int priceOfVehicle) {
		this.priceOfVehicle = priceOfVehicle;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
