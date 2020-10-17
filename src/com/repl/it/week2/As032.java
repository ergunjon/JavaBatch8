package com.repl.it.week2;

import java.util.Scanner;

public class As032 {

	public static void main(String[] args) {
		//For you to do: 
		//Ask the user to enter his/her gender "Please enter your gender: M or F" 
		//and their age "Please enter your age"

		// have 2 conditions:
		//If age is above 25, then check if a user entered F then the output should be "Woman" 
		//otherwise it should say "Man"
		//If age is below 25, then check if a user entered F then the output should be "Girl" 
		//otherwise it should say "Boy"
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your gender: M or F");
		String gender = "M";
		gender=input.next();
		System.out.println("Please enter your age");
		int age;
		age=input.nextInt();
		String answer;
		
		if(gender.equalsIgnoreCase("M")) {
			if(age<25) {
				answer="Boy";
			}else {
				answer="Man";	
			}
		}else {
			if(gender.equalsIgnoreCase("F")) {
			  if(age<25) {
				answer="Girl";
			}else {
				answer="Woman";
			}
		}else {
			answer="Invalid data please enter M or F";
		}
		
		
			
		
	
		}
		 System.out.println(answer);
}
}


	



	


