package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner input;
		String answer;
		double balance;

		input = new Scanner(System.in);
		System.out.println("Please enter if you have any credit card (yes/no)");

		answer = input.next();

		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What's the balance on your card?");
			balance = input.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off your card balance");
			} else {
				System.out.println("You can spend more $$");
			}
		} else {
			System.out.println("Would you like to get a credit card?");
			
		}
	}

}
