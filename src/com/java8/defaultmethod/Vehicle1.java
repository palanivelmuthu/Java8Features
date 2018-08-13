package com.java8.defaultmethod;

public interface Vehicle1 {
	
	default void printEngineType(){
		System.out.println("Vehicle1 Engine Type");
	};
	
}
