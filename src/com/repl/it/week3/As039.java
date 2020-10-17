package com.repl.it.week3;

import java.util.Scanner;

public class As039 {

	public static void main(String[] args) {
		// A school has following rules for grading system:
		//a. 1 to 25 - F
		//b. 25 to 45 - E
		//c. 45 to 50 - D
		//d. 50 to 60 - C
		//e. 60 to 80 - B
		//f. Above 80 - A
		//Ask the user to enter marks and print the corresponding grade. 
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your mark");

		int score=input.nextInt();
		
		
		if (score>1 && score<=25) {
			System.out.println("Your grade is F");
			
		}else if(score>25 && score<=45) {
			System.out.println("Your grade is E");
			
		}else if(score>45 && score<=50) {
			System.out.println("Your grade is D");
			
		}else if(score>50 && score<=60) {
			System.out.println("Your grade is C");
			
		}else if(score>60 && score<=80) {
			System.out.println("Your grade is B");
			
		}else if(score>80) {
			System.out.println("Your grade is A");
			
	    }else {
		    System.out.println("Please enter valid mark");
	    }
		
		 

	}


}



