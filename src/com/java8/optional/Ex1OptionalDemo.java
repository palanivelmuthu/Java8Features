package com.java8.optional;

import java.util.Optional;

public class Ex1OptionalDemo {

	public static void main(String[] args) {
		
		String greeting = null;
		String name = null;
		
		Optional<String> optVar1 = Optional.ofNullable(greeting);
		Optional<String> optVar2 = Optional.ofNullable(name);
		//Optional<String> optVar2 = Optional.of(name);    // If you sure name is not null 
		
		
		Optional<String> output = concat(optVar1,optVar2);
		
		if(output.isPresent())
			System.out.println(output.get());

	}

	private static Optional<String> concat(Optional<String> greet, Optional<String> name) {
		
		System.out.println("Greet Variable Present :"+greet.isPresent());
		System.out.println("Name Variable Present :"+name.isPresent());
		
		return Optional.ofNullable(greet.orElse("Hello ").concat(name.orElse("Defaultname")));
		
	}

}
