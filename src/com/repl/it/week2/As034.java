package com.repl.it.week2;

import java.util.Scanner;

public class As034 {

	public static void main(String[] args) {
		//Write a program to find the largest number among three distinct numbers using nested if condition
		//Please use Scanner class to take input from users

		//Expected Output:
		//Please enter 3 distinct numbers 4 5  and 14
		//The largest number is 14
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		String answer = null;
		
		if(num1>num2) {
			if(num1>num3) {
				answer="The largest number is "+num1;
			}else if(num3>num1) {
				answer="The largest number is "+num3;
			}
		}else {
			if(num2>num3) {
				answer="The largest number is "+num2;
			}else {
				answer="The largest number is "+num3;
			}
		}
		
		System.out.println(answer);
		
		
		}
	}

		
	


		
			
				
			
			
		




	
