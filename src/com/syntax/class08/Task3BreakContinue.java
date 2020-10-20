package com.syntax.class08;

import java.util.Scanner;

public class Task3BreakContinue {

	public static void main(String[] args) {
		//1- Print numbers from 1 to 50 except those that are divisible by 3
		
        //2-Create a program that will keep asking user to apply for a credit card. 
	     // As soon you get “yes” from a user program should stop asking.
		
		System.out.println("Print numbers from 1 to 50 except those that are divisible by 3");
		for(int i=1; i<=50; i++) {
			if (i%3==0) {
				continue;
			}
				System.out.print(i+" ");
			}
		
		
		System.out.println();
		System.out.println("-----------------Task2-------------------");
		
		Scanner input=new Scanner(System.in);
		String response;
		
		do {
			System.out.println("Do you want to apply for credit card?");
			response=input.next();
			
		   }while (!response.equalsIgnoreCase("yes"));
		   System.out.println("You are selected");
		
		


	}
}


