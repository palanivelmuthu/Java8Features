package com.java8.lambda.ex3;

import java.util.function.Supplier;

public class Ex3SupplierInterfaceDemo {
	
	public static void main(String a[]){
		
		Supplier<String> si1 = new Supplier<String>(){  // Supplier Anonymous Implementation
			@Override
			public String get() {
				return "Supplier Interface String";
			}};
		
		
		Supplier<String> si2 = ()->"Supplier Lambda String"; // direct way of lambda implementation
		Supplier<String> si3 = ()-> new String("New String for Print Method");
		Supplier<String> si4 = ()-> Ex3SupplierInterfaceDemo.getStringFunction(); // AnyFunction that returns String can be attached to lambda that returns same type
		Supplier<String> si5 = Ex3SupplierInterfaceDemo::getStringFunction;  // Method Reference. see more in next package
		
		System.out.println(si1.get());	
		System.out.println(si2.get());
		Ex3SupplierInterfaceDemo.printMethod(si3);
		System.out.println(si4.get());
		System.out.println(si5.get());
		
	}
	
	public static void printMethod(Supplier<String> s){
		System.out.println(s.get());
	}
	
	public static String getStringFunction(){
		return "String from Function";
	}
	
}
