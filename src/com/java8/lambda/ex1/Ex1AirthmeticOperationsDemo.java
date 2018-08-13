package com.java8.lambda.ex1;

public class Ex1AirthmeticOperationsDemo {

	public static void main(String[] args) {
		
		int a=10;
		Calculator calc = new Calculator(); // This class is not really needed.
		
		// Creating Anonymous inner class
		SquareCalculator sq = new SquareCalculator() {
			
			@Override
			public int calculateSquare(int num) {
				return num*num;
			}
		};
		calc.setSquareCalulator(sq);
		System.out.println("Square of Number "+a+" is "+calc.getSquareCalulator().calculateSquare(a));
		
		
		
		// Creating lambda Expression
		SquareCalculator lambdasq = (num)->{return num*num;};
		System.out.println("Square of Number "+a+" is "+lambdasq.calculateSquare(a));

	}
	


}
