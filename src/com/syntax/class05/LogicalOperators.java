package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// OPERATORS IN JAVA
		//Assignment =
		//Arithmetic+,-,*,/
		//Relational >,<,>=,<=,==,!=
		//Logical &&,||
		
		//&& Logical AND
		//|| Logical OR
		//&& all conditions need to be true || only one or more need to be true
		
		//I need to define whether number that is entered from user is small, large, and extra large
		//if number is >1 but smaller than 10 --> small
		//if number is >11 but smaller than 100 -->medium
		//if number is >101 but smaller than 1000 -->large
		
		//AND(&&)
		//if ( true && true ) --> TRUE
		//if ( true && false )--> FALSE
		//if ( false && true )--> FALSE
		//if ( false && false )--> FALSE
		
		//OR(||)
		//if( true || true )--> TRUE
		//if( true || false )--> TRUE
		//if( false || true )--> TRUE
		//if( false || false )--> FALSE
		
		System.out.println("-------------------------TASK1------------------------");
		
		Scanner input;
		int number;
		
		input=new Scanner(System.in);
		System.out.println("Please enter any number");
		number=input.nextInt();
		
		if(number>0 && number<=10) {
			System.out.println("You entered small number");
		}else if (number>10 && number<=100){
			System.out.println("You entered medium number");
		}else if (number>101 && number<=1000) {
			System.out.println("You entered large number");
		
	}else {
		System.out.println("Invalid");
		
		}

	}
}


