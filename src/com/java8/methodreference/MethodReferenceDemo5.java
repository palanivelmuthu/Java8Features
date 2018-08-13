package com.java8.methodreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

// Method Reference of Instance of an orbitary object of a particular type
// Here method of instance variable o1 is invoked o1.compareTo   to other instance. 
// This is called instance of arbitary type method reference
public class MethodReferenceDemo5 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,44,88,987,1,847);

		numbers.sort(new Comparator<Integer>(){
				@Override
				public int compare(Integer o1, Integer o2) {
					return o1.compareTo(o2);
				}});

		
		
		numbers.sort((Integer o1, Integer o2)-> o1.compareTo(o2)); // Lambda way
		numbers.sort(Integer::compareTo); // Arbitary Lambda Method Reference
		numbers.forEach(System.out::println);
		
		
		System.out.println("-----------------------Another Example--------------------------------------");
		
		BiFunction<Integer,Integer,Integer> sum = new BiFunction<Integer, Integer, Integer>() {

			@Override
			public Integer apply(Integer i1, Integer i2) {
				return i1.sum(i1, i2);
			}
		};
		
		BiFunction<Integer,Integer,Integer> sumLambda = (Integer i1, Integer i2)-> i1.sum(i1, i2); // Lambda way
		BiFunction<Integer,Integer,Integer> sumLambdanew = Integer::sum; // Arbitary Lambda way
		System.out.println(sumLambdanew.apply(44, 33));
	}
}

