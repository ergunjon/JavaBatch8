package com.repl.it.week2;

import java.util.Scanner;

public class As021 {

	public static void main(String[] args) {
		
		//Write a program that asks the user's age: "Enter your age  "
		//Then display it by adding 10 (i.e age + 10) in your final output. 

		
		Scanner scan = new Scanner(System.in);
	   
		System.out.println("Enter your age");
		int age=scan.nextInt();
		int num=10;
		System.out.println("Your age after 10 years is "+(age+num));
		
		
		
		
		
		
	}

}
