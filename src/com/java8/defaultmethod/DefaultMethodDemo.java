package com.java8.defaultmethod;

public class DefaultMethodDemo {
	
	public static void main(String a[]){
		Car car = new Car();
		Jeep jeep = new Jeep();
		
		car.printVehicleName();
		car.printEngineType();  // Default method from Interface Vehicle
		
		jeep.printVehicleName();
		jeep.printEngineType();  // Default Method overridden from Interface
	}

}
