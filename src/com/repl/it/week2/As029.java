package com.repl.it.week2;

import java.util.Scanner;

public class As029 {

	public static void main(String[] args) {
		// For you to do: 
		//Write a java program that prints out true if ( x * y ) returns a positive value. Else prints out false if  (x * y) returns a negative value. 

		//Step 1: Your program should ask "Please enter first number" - for the 1st number and "Please enter second number" - for the 2nd number.

		//Step 2: Create if condition to check if the multiplication of x and y values is positive or negative.
		//If the result of a multiplication is positive print true, otherwise print false.

		//Example Output: 
		//Please enter first number
		//Please enter second number
		//true

		//Example Output: 
		//Please enter first number
		//Please enter second number
		//false
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter first number");
		int firstnumber=input.nextInt();
		System.out.println("Please enter second number");
		int secnumber=input.nextInt();
		
		if(0<(firstnumber*secnumber)) {
			System.out.println("True");
		
		}else {
			System.out.println("False");
		}

	}

}
