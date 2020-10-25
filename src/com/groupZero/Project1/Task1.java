package com.groupZero.Project1;

public class Task1 {

	public static void main(String[] args) {
		
		// Write a program to swap 2 numbers without a temporary variable?
		// Swap 2 strings without a temporary variable?

				int a = 10;
				int b = 20;
				System.out.println(a + " " + b);
				a = a + b; // a = 30
				b = a - b; // b = 10
				a = a - b; // a = 20
				System.out.println(a + " " + b);

				System.out.println("---------------------------------------");
		  int x = 10;
		  int y = 20;

		  System.out.println("Before Swapping");
		  System.out.println("Value of x is :" + x);
		  System.out.println("Value of y is :" + y);

		  //add both the numbers and assign it to first
		  x = x + y;
		  y = x - y;
		  x = x - y;

		  System.out.println("Before Swapping");
		  System.out.println("Value of x is :" + x);
		  System.out.println("Value of y is :" + y);
		 }
		

	}


