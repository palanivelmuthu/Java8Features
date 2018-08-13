package com.java8.lambda.ex4;

import java.util.Arrays;
import java.util.List;

import com.java8.lambda.ex2.Person;
import com.java8.lambda.ex2.PersonFactory;

public class Ex4PredicatesInterfaceDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,5,33,98,0,-22,-2,-5,-55,20,18,11);
		List<Person> persons = PersonFactory.createPersons();
		
		
		numbers.forEach(i->{if(CustomPredicates.positivePredicate.test(i)) System.out.println(i); });
		
		System.out.println("Printing Positive Numbers------");
		numbers.forEach(i->{if(CustomPredicates.positivePredicate.test(i)) System.out.println(i); });
		
		System.out.println("Printing Negative Numbers------");
		numbers.forEach(i->{if(CustomPredicates.negativePredicate.test(i)) System.out.println(i); });
		
		System.out.println("Printing Even Numbers------");
		numbers.forEach(i->{if(CustomPredicates.evenPredicate.test(i)) System.out.println(i); });
		
		
		System.out.println("Printing custom Numbers------");
		numbers.forEach(i->{if(CustomPredicates.getNumberPredicate(5).test(i)) System.out.println(i); });

		
		/*persons.forEach(new Consumer<Person>() {  
				@Override
				public void accept(Person p) {
					if(CustomPredicates.malePredicate.test(p)){
						System.out.println(p);
					}
				}
			});*/  // Short Version is given below
		
		
		System.out.println("\nPrinting Male Persons-------");
		persons.forEach(p->{if(CustomPredicates.malePredicate.test(p))System.out.println(p);});

		System.out.println("\nPrinting Female Persons-------");
		persons.forEach(p->{if(CustomPredicates.femalePredicate.test(p))System.out.println(p);});
		
		System.out.println("\nPrinting Custom Persons for Zip-------");
		persons.forEach(p->{if(CustomPredicates.getSpecificZip(50131).test(p))System.out.println(p);});
				
		System.out.println("\nPrinting Custom Persons for Zip and Male-------");
		persons.forEach(p->{if(CustomPredicates.getSpecificZip(50131).and(CustomPredicates.malePredicate).test(p))System.out.println(p);});
		
		System.out.println("\nPrinting Custom Persons for Zip or Male-------");
		persons.forEach(p->{if(CustomPredicates.getSpecificZip(50131).or(CustomPredicates.malePredicate).test(p))System.out.println(p);});

		System.out.println("\nPrinting Custom Persons for Zip or Male NEGATIVE-------");
		persons.forEach(p->{if(CustomPredicates.getSpecificZip(50131).or(CustomPredicates.malePredicate).negate().test(p))System.out.println(p);});
				
	}

	
}
