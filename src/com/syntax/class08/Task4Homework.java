package com.syntax.class08;

import java.util.Scanner;

public class Task4Homework {

	public static void main(String[] args) {
		 // Write a program to ask a user to enter item they want to buy and the price of that item.
		 // Every time user enters money accumulate the amount and tell the user how much is left to pay off. 
		 // If user give more money program should return a change. 
		 // Whenever a user done with payments program should say “Thank you for shopping!”
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter item you want to buy.");
		String item=input.next();
		System.out.println("Please enter the price");
		int price=input.nextInt();
		int actualPrice = 500;
		int leftoff=actualPrice-price;
		int change=price-actualPrice;
		
		while(actualPrice!=price) {
			if(actualPrice>price) {
				System.out.println("Remaining balance is $"+leftoff+", please enter more money");
				
			}else{
				System.out.println("Here is your change $"+change);
				System.out.println("Thank you for shopping!");
			}
			price=input.nextInt();
		}
			System.out.println("Thank you for shopping!");
		
		
	}
}
		
		
		
	
		
		
		
		


