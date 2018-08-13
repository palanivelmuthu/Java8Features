package com.java8.lambda.ex1;

public class ThreadDemo {

	public static void main(String[] args) {
		
		// Old way
		Thread t0 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("I am Thread 0");
				
			}});
		
		// Lambda Style
		Thread t1 = new Thread(()->{System.out.println("I am Thread 1");});
		Thread t2 = new Thread(()->System.out.println("I am Thread 2"));
		Thread t3 = new Thread(()->System.out.println("I am Thread 3"));
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		
		//-----------------------------------------------------------------------------------
		
		Runnable r0 = new Runnable(){

			@Override
			public void run() {
				System.out.println("I am Runnable thread 0");
			}}	;
		
		Runnable r1 = ()->System.out.println("I am Runnable thread 1");
		Runnable r2 = ()->System.out.println("I am Runnable thread 2");
		Runnable r3 = ()->System.out.println("I am Runnable thread 3");
		
		r0.run();
		r1.run();
		r2.run();
		r3.run();
		
	}

}
