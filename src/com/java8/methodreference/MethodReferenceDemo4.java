package com.java8.methodreference;

import java.util.Locale;
import java.util.function.BiFunction;

// Constructor Method interface 
// Here we are passing the variables to constructor and return the object
public class MethodReferenceDemo4 {

	public static void main(String[] args) {
		
		//BiFunction<T, U, R> Inbuild Functional Interface takes two argumment T,U and Returns of type R
		
		BiFunction<String, String, Locale> localFactory = new BiFunction<String, String, Locale>(){
			@Override
			public Locale apply(String arg0, String arg1) {
				return new Locale(arg0,arg1);
			}
		};
		
		BiFunction<String, String, Locale> localFactory1 = (lang,country)->new Locale(lang,country);
		BiFunction<String, String, Locale> localFactory2 = Locale::new;
		
		Locale locale = localFactory.apply("en", "US");
		Locale locale1 = localFactory1.apply("en", "US");
		Locale locale2 = localFactory2.apply("en", "US");
		
		System.out.println(locale);
		System.out.println(locale1);
		System.out.println(locale2);

	}
}

