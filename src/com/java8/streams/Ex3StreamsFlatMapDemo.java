package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Stream Flat Map takes Stream and gives stream on another Stream.
public class Ex3StreamsFlatMapDemo {

	public static void main(String[] args) {
		List<User> names = Arrays.asList(
				new User("Ram","25",Arrays.asList("1","2")),
				new User("Arun","30",Arrays.asList("3","5")),
				new User("Palanivel","26",Arrays.asList("6","7")),
				new User("Laksh","52",Arrays.asList("8","5")));


	
		System.out.println("Printing the value if found");
		Optional<String> strOptional = names.stream()
				.map(user->user.getPhoneNo().stream())
				.flatMap(strStream->strStream.filter(number->number.equals("5")))
				.findAny();
		
		strOptional.ifPresent(System.out::print);  // output as 5
		
	}


	public static class User{
		
		private String name;
		private String age;
		private List<String> phoneNo;
		
		
		public User(String name, String age, List<String> phoneNo) {
			super();
			this.name = name;
			this.age = age;
			this.phoneNo = phoneNo;
		}

		public List<String> getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(List<String> phoneNo) {
			this.phoneNo = phoneNo;
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
			return "User [name=" + name + ", age=" + age + ", phoneNo=" + phoneNo + "]";
		}


		
	}


}

