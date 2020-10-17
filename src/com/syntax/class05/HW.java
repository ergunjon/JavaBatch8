package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// Write a program to find largest of three double values using if-else..if and 
		//logical operators provided by a user (numbers must be distinct)
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 3 numbers with decimal");
		
		double num1 = 0, num2 = 0, num3 = 0;
		num1=input.nextDouble();
		num2=input.nextDouble();
		num3=input.nextDouble();
		
		if(num1>num2 && num1>num3) {
			System.out.println("Largest number is "+num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println("Largest number is "+num2);
		}else if(num3>num1 && num3>num2) {
			System.out.println("Largest number is "+num3);
		}
		System.out.println("-----------------------------------------------------------");
		

	}

}
