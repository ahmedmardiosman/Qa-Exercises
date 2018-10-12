package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {

	private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void addVeh(Vehicle v) {
		vehicleList.add(v);
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public int bill() {

		List<Integer> priceList = new ArrayList<Integer>();

		int cost = 0;

		// vehicleList.stream().forEach(System.out::println);

		priceList = vehicleList.stream().map(p -> p.getPriceOfVehicle()).collect(Collectors.toList());
		for (Integer i : priceList) {
			cost += i;
		}
		return cost;

	}

	public List<Vehicle> addingVehiclesToList(Vehicle v) {
		vehicleList.add(v);
		System.out.println(v.getBrand() + " was added to the garage");
		return vehicleList;

	}
	
	
	public List<Vehicle> removeVehiclesToList(Vehicle v) {
		vehicleList.remove(v);
		System.out.println(v.getBrand() + " was removed from the garage");
		return vehicleList;

	}

}
