package com.java8.lambda.ex2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Ex2ConsumerInterfaceDemo {
	
	public static void main(String a[]){
		
		List<Person> persons = PersonFactory.createPersons();
		Collections.sort(persons,new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		
		System.out.println("\n-----------Regular way using anonymous -------------");
		persons.forEach(new Consumer<Person>() { // anonymous Consumer Implementation

			@Override
			public void accept(Person p) {
				System.out.println(p); // Here you can implement any logic
			}
		});

		
		System.out.println("\n-----------Lambda Way of Coding Output below Using Consumer Interface--------------");
	
		List<Person> lambdapersons = PersonFactory.createPersons();
		Collections.sort(lambdapersons, (p1,p2)->p1.getName().compareTo(p2.getName()));
		lambdapersons.forEach((p)->{System.out.println(p);});
		
		
		System.out.println("\n-----------Joining Two lambda Functions Using Consumer Interface-------------------");
		
		Consumer<Person> c1 = (p)->System.out.print(p.getName());
		Consumer<Person> c2 = c1.andThen((p)->System.out.println(" "+p.getAge()));
		lambdapersons.forEach(c2);
 		
	}

}
