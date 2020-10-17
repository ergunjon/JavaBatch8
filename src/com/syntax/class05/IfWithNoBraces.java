package com.syntax.class05;

public class IfWithNoBraces {

	public static void main(String[] args) {
		
		boolean isSaturday=false;
		
		// if den sonra parantez kullanmazsan otomatik olarak altindakini if kabul eder
		
		if(isSaturday) 
			System.out.println("Today is a Java class");// if no braces only 1 line will be treated 
		    System.out.println("And tomorrow I will have a Java class");//this code does not belong to the if statement
		
			System.out.println("Today is not Saturday");
		
		
			
		
		System.out.println("I am a code outside of if statement");

	}

}
