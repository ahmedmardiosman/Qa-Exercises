package com.qa.Garage;

public class Car extends Vehicle {

	private int numberOfCarDoors;
	private String carName;

	public Car(String brand, int numberOfWheels, int numberOfCarDoors, String carName) {
		super(brand, numberOfWheels);
		this.setNumberOfCarDoors(numberOfCarDoors);
		this.setCarName(carName);

	}

	public void drive() {

		System.out.println("You are driving your Car");

	}

	public int getNumberOfCarDoors() {
		return numberOfCarDoors;
	}

	public void setNumberOfCarDoors(int numberOfCarDoors) {
		this.numberOfCarDoors = numberOfCarDoors;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

}
