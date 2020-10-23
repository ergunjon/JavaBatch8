package com.syntax.class010;

import java.util.Scanner;

public class Task2HW {

	public static void main(String[] args) {
		//Create an array on double using scanner and calculate the sum of all elements 
		//that was stored in an array.
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 3 number");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		double[] numbers = {num1, num2, num3};
		double sum=num1+num2+num3;
		System.out.println(sum);
		
		
		
	}

}
