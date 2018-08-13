package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Stream Map takes one type as input and converts it to another type.
// collect() method is a Termination operation that collects as list
// Here in this example, it takes String name and returns that as User object
public class Ex2StreamsMapDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Palanivel","Raj","xavier","Aarav","Deepa","Sandeep","Praveen","Prithiv");

		// Imperative Style
		names.stream()
			.filter((name)->name.startsWith("P"))
			.map(new Function<String, User>() {

				@Override
				public User apply(String name) {
					return new User(name);
				}
			})
			.forEach(System.out::println);
		
		
		System.out.println("Functional Style");
		// Functinal Style
		names.stream().filter((name)->name.startsWith("P"))	.map(User::new) //.map((name) -> new User(name))
		.forEach(System.out::println);
		
		
		System.out.println("Collecting as List");
		List<User> collect = names.stream().filter((name)->name.startsWith("P"))	.map(User::new).collect(Collectors.toList());
		collect.forEach(System.out::print);
		
		
	}


	public static class User{
		
		private String name;
		private String age = "25";
		
		
		public User(String name) {
			super();
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}
		
		
	}


}

