package com.java8.defaultmethod;

public interface Vehicle extends Vehicle1 {
	
	public void printVehicleName();
	
	default void printEngineType() {
		System.out.println("Vehicle Engine Type");
	}

}
