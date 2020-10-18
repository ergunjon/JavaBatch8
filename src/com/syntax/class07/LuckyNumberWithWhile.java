package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberWithWhile {

	public static void main(String[] args) {
		   //play lottery where we need to enter number from 1 to 100
		   //lucky number is 7
		   //keep asking a user to enter a number until they enter a lucky number
		
		Scanner input;
		int numberFromUser;
		
		int luckyNumber=7;
		
		input=new Scanner(System.in);
		System.out.println("Please enter any number from range 1 to 100");
		numberFromUser=input.nextInt();
		
		while(numberFromUser!=luckyNumber) {
			System.out.println("Please enter any number from range 1 to 100");
			numberFromUser=input.nextInt();
		}
		System.out.println("You are the Winner!!!");
		

	}

}
