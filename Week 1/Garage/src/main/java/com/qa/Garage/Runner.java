package com.qa.Garage;

public class Runner {

	public static void main(String[] args) {

		Car mercedes = new Car("Mercedes", 4, 5, "peter");
		mercedes.setBrand("bmw");

		Car audi = new Car("Audi", 2, 4, "peter");
		
		
		
		mercedes.setPriceOfVehicle(1000);

		Motorcycle harley = new Motorcycle("bmw", 2, 55);
		harley.setPriceOfVehicle(500);

		Aeroplane airbus = new Aeroplane("Airbus A380 ", 3, 34);
		airbus.setPriceOfVehicle(300000);

		System.out.println(mercedes.getCarName());
		System.out.println(mercedes.getBrand());

		System.out.println(harley.getheightOfSeat());

		System.out.println(airbus.getNumberOfSeats());

		Garage g = new Garage();
		
		g.addVeh(mercedes);
		
		g.addVeh(harley);
		
		g.addVeh(airbus);
		
		System.out.println(g.bill());
		
		g.addingVehiclesToList(audi);
		
		g.removeVehiclesToList(airbus);

		

	}

}
