package com.java8.lambda.ex4;

import java.util.function.Predicate;

import com.java8.lambda.ex2.Gender;
import com.java8.lambda.ex2.Person;

public class CustomPredicates {
	
	public static Predicate<Integer> positivePredicate = new Predicate<Integer>(){
		@Override
		public boolean test(Integer i) {
			return i>0;
		}};
	
	public static Predicate<Integer> negativePredicate = i->i<0;
	
	public static Predicate<Integer> evenPredicate = i->i%2 == 0 && i >0;
	
	public static Predicate<Person> malePredicate = p->p.getGender().equals(Gender.MALE);
	
	public static Predicate<Person> femalePredicate = p->p.getGender().equals(Gender.FEMALE);
	
	public static Predicate<Person> getSpecificZip(Integer zip){
		return p->p.getAreaCode()==zip;
	}
	
	public static Predicate<Integer> getNumberPredicate(Integer number){
		return i->i==number;
	}
	
}
