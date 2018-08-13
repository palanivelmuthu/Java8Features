package com.java8.methodreference;

import java.util.List;
import java.util.function.Supplier;

import com.java8.lambda.ex2.Person;
import com.java8.lambda.ex2.PersonFactory;

// StaticMethodReference Example
public class MethodReferenceDemo1 {
	
	public static void main(String a[]){
		List<Person> persons = PersonFactory.createPersons();
		
		System.out.println("\n Output 1");
		persons.forEach((p)->System.out.println(p)); // Using ConsumerInterface to Print Persons.
		System.out.println("\n Output 2");
		persons.forEach(System.out::println); // Using ConsumerInterface Method Reference to Print Persons.
		
		
		System.out.println("\n Output 3");
		persons.forEach((p)->MethodReferenceDemo1.printMethod(p)); // Using our own static method to print persons
		
		System.out.println("\n Output 4");
		persons.forEach(MethodReferenceDemo1::printMethod); // Using our own static method Reference to print persons
		
		System.out.println("\n Output 5");
		Supplier<String> si = MethodReferenceDemo1::createString;  // Method Reference for Supplier Interface.
		System.out.println(si.get());
		
	}
	
	public static void printMethod(Person p){
		System.out.println(p);
	}
	
	
	public static String createString(){
		return "Method Reference String for Supplier Interface Method Reference";
	}

}
