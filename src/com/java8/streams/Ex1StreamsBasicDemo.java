package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

// Stream can be of conveyor belt where different operation can be performed.
// Here people.stream put the people objects on stream and after that
// it perform different operations.

// Stream we can say it can consist of 3 elements
// 1. source -- that is the list of collection elements
// 2. Intermediate Operations that are performed on the stream
// 3. End operation or Terminal Operation forEach that makes the stream to end
// Intermediate Operations :  anyMatch(),distinct(),filter(),findFirst(),flatMap(),map(),skip(),sorted()
// Terminal Operations :  count(), max(),min(),reduce(),summaryStatics()

public class Ex1StreamsBasicDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Palanivel","Raj","xavier","Aarav","Deepa","Sandeep","Praveen","Prithiv");

		
		IntStream.range(1,10).forEach(System.out::println); // 123456789
		
		
		System.out.println("Skip first 5 rows");
		IntStream.range(1,10).skip(5).forEach(System.out::println);  // 6789
		
		System.out.println("Sum of all 1 to 5 --> "+ IntStream.rangeClosed(1,5).sum());
				
		
		
		// Sorting
		names.stream().sorted().forEach(System.out::println); // Sort and print
		
		
		names.stream().sorted().findFirst().ifPresent(System.out::print); // Aarav
		
		// Filtering
		names.stream().filter(predicateMethod()); // This can be replaced with below lambda style. This is anonymous class
		
		System.out.println("\nFiltering that takes out Aarav from the list");
		names.stream().filter(name->isNotOfName(name)).forEach(System.out::println);  // This can be replaced by below code
		names.stream().filter(Ex1StreamsBasicDemo::isNotOfName).forEach(System.out::println);
	

		System.out.println("Filtering that takes names with P");
		names.stream().filter((name)->name.startsWith("P")).forEach(System.out::println);

		
		System.out.println("Count that takes names with P -->" + names.stream().filter((name)->name.startsWith("P")).count());
		
		
	}

	private static Predicate<String> predicateMethod() {
		
		return new Predicate<String>(){
			@Override
			public boolean test(String name) {
				return !name.equals("Aarav");
			}
		};
	}

	private static boolean isNotOfName(String name) {
		return !name.equals("Aarav");
	}

}
