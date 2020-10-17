package com.syntax.class06;

import java.util.Scanner;

public class ExampleForNotOperator {

	public static void main(String[] args) {
		// Write a program to find largest of three double values using if-else..if and 
		//logical operators provided by a user (numbers must be distinct)
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 3 numbers with decimal");
		
		double num1 = 0, num2 = 0, num3 = 0; Object max;
	
		num1=input.nextDouble();
		num2=input.nextDouble();
		num3=input.nextDouble();
		
		if(!(num1==num2 && num2 == num3)) {
			
			if(num1>num2 && num1>num3) {
				max=num1;
			}else if (num2>num3) {
				max=num2;
			}else {
				max=num3;
			}
			System.out.println(max);
		}else {
			System.out.println("Numbers are equal");
		
		
		}
	}
}