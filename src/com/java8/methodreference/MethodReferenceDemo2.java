package com.java8.methodreference;

import java.util.List;
import java.util.function.Supplier;

import com.java8.lambda.ex2.Person;
import com.java8.lambda.ex2.PersonFactory;

// InstanceMethodReference Example on consumer Interface
public class MethodReferenceDemo2 {
	
	public static void main(String a[]){
		List<Person> persons = PersonFactory.createPersons();
		
		MethodReferenceDemo2 methodReference = new MethodReferenceDemo2();
		
		System.out.println("\n Output 1");
		persons.forEach((p)->methodReference.printMethod(p)); // Using our own Instance method to print persons
		
		
		
		System.out.println("\n Output 2");
		persons.forEach(methodReference::printMethod); // Using our own Instance method Reference to print persons
		System.out.println();
		persons.forEach(System.out::println);// Using Inbuild out instance method Reference to print persons.
		
		
		
		System.out.println("\n Output 3");
		Supplier<String> si = methodReference::createString;  // Method Instance for Supplier Interface.
		System.out.println(si.get());
		
	}
	
	public void printMethod(Person p){
		System.out.println(p);
	}
	
	
	public String createString(){
		return "Method Reference String for Supplier Interface Method Reference";
	}

}
