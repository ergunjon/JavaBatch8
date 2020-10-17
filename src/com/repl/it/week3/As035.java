package com.repl.it.week3;

import java.util.Scanner;

public class As035 {

	public static void main(String[] args) {
		// Create a program that prompt user with question:  "Do you need a loan?"
		//If the result is true then prompt user with question: "What is your credit score?".
		//Otherwise eligibility is "Unknown"
		
		//Based on the score define users eligibility:
		//if score is below  600 --> eligibility = "Not eligible"
		//if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
		//if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
		//if score is higher than any other previous values --> eligibility = "Definitely eligible" 
		
		Scanner input=new Scanner(System.in);
		System.out.println("Do you need a loan? - Please answer true/false");
		
		boolean loan=true;
		loan=input.nextBoolean();
		boolean cosigner=true;
	
		int score = 0, ssn, income;
		
		String answer = null;
		String firstname, lastname;
		
		if(loan) {
			System.out.println("What is your credit score?");
			score=input.nextInt();
			if(score<=600) {
				System.out.println("Not eligible");
				System.out.println("Are you able to find co-signer sis? - Please answer true/false");
				cosigner=input.nextBoolean();
				if(cosigner) {
					System.out.println("Cool please enter co-signer's first name");
					firstname=input.next();
					System.out.println("please enter co-signer's last name");
					lastname=input.next();
					System.out.println("Please enter SSN");
					ssn=input.nextInt();
					System.out.println("Please enter your yearly income");
					income=input.nextInt();
					if(income<45000) {
						System.out.println("You are not eligible to be co-signer");
				
				}else {
					System.out.println("Congratulations you are approved!!!!");
				}
				}else{
					System.out.println("Ok then you can leave before I call security");
				}
			}else if(score>600 && score<=700) {
				answer="Maybe eligible";
			}else if(score>700 && score<=800) {
				answer="Eligible";
			}else if(score>800) {
				answer="Definitely eligible";
		}else {
			 answer = "Unknown";
		}
		
		System.out.println(answer);
		
		
		

	}
}
}








