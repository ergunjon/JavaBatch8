package com.repl.it.week3;

import java.util.Scanner;

public class As038 {

	public static void main(String[] args) {
		// For you to do:
		//Prompt user with a question: "Is it weekend?"
			//If it is not a weekend --> subject="Manual testing"
			//Otherwise --> subject="Java"
			//Output: 
			//Today you will be learning ____
		
		Scanner input=new Scanner(System.in);
		System.out.println("Is it weekend?");
		boolean weekend=true;
		weekend=input.nextBoolean();
		
		if(weekend) {
			System.out.println("Today you will be learning Java");
		}else {
			System.out.println("Today you will be learning Manual testing");
		}

	}

}
