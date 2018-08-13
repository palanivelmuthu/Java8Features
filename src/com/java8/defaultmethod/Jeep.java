package com.java8.defaultmethod;

public class Jeep implements Vehicle {

	@Override
	public void printVehicleName() {
		System.out.println("This Vehicle is Jeep");
		
	}
	
	public void printEngineType(){
		System.out.println("I am overriding the Vehicle Engine type to Jeep Engine");
	}

}
