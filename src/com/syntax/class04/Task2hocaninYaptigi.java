package com.syntax.class04;

public class Task2hocaninYaptigi {

	public static void main(String[] args) {
		//1-Write a program to store a boolean value of whether user has diploma or not. 
		//If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. 
		//Then if user has a degree program should check a gpa score. 
		//If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, otherwise → “You should have studied harder” .

		boolean diploma = true;
		double score = 3.3;
		
		if(diploma) {//if user has diploma we do further check of gpa
			System.out.println("Congratulations");
			
			if(score >=3.5) {
				System.out.println("Your eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("Get a degree");
		}
		System.out.println("----------------------Task2-------------------------");
		
		//2-Create a Java program and store values of mortgage rate and mortgage price. 
		//First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying. 
		//Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
		
		double morgage = 3.1;
		double price = 2000000;
		
		if(morgage<4.5) {
			System.out.println("I will buy a house");
			
			if(price <=200000) {
				System.out.println("I will Pay Cash");
			}else {
				System.out.println("i will take a loan");
			}
		}else {
			System.out.println("I will not buy a house");
		}
	
	}
}
