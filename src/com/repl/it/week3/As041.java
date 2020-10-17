package com.repl.it.week3;

import java.util.Scanner;

public class As041 {

	public static void main(String[] args) {
		// Write a program using the switch statement  
		//Let us consider the scenario regarding the born baby age 
	//	First Output: "enter the age of the Child"
	//	case 1: if age is 1 print as "You can Crawl"
	//case 2 : if age is 2 print as  "You can Talk"
	//case 3: If age is 3 print as "You can Dance"
	//case 4: if age is 4 print as "You can get  Trouble"
	//Other than this age (1-4) it should print "I don't know how old you are" 
		

		Scanner input=new Scanner(System.in);
		System.out.println("enter the age of the Child");
		int age=input.nextInt();
		String answer;
		switch(age) {
		
		case 1 :
			answer="You can Crawl";
			break;
		case 2:
			answer="You can Talk";
			break;
		case 3:
			answer="You can Dance";
			break;
		case 4:
			answer="You can get  Trouble";
			break;
		default:
			answer="I don't know how old you are";
			break;
			
		}
		System.out.println(answer);
		
	}

}
