package com.repl.it.week3;

import java.util.Scanner;

public class As037 {

	public static void main(String[] args) {
		// Take 2 boolean inputs from a user: 
		//"Are you thirsty?"
		//"Are you sleepy?
		//If user is thirsty and not sleepy--> drink=Water
		//If user is thirsty and sleepy--> drink=Coffee
		//If user is not thirsty and sleepy --> drink=Tea
		//Otherwise drink="Nothing

		Scanner input=new Scanner (System.in);
		System.out.println("Are you thirsty?");
		String firstanswer,secondanswer,answer, water = null;
		firstanswer=input.next();
		System.out.println("Are you sleepy?");
		secondanswer=input.next();
		
		if((firstanswer.equalsIgnoreCase("Yes")) && (secondanswer.equalsIgnoreCase("No"))) {
			answer="You need to drink water";
	}else if((firstanswer.equalsIgnoreCase("Yes")) && (secondanswer.equalsIgnoreCase("Yes"))) {
			answer="You need to drink Coffee";
		}else if((firstanswer.equalsIgnoreCase("No")) && (secondanswer.equalsIgnoreCase("Yes"))) {
			answer="You need to drink tea";
		}else if((firstanswer.equalsIgnoreCase("No")) && (secondanswer.equalsIgnoreCase("No"))) {
			answer="You are boring";
		
	}else {
		answer="Invalid data please enter Yes/No";	
		}
		System.out.println(answer);
		
		
	
	}

}

