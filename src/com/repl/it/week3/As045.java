package com.repl.it.week3;

import java.util.Scanner;

public class As045 {

	public static void main(String[] args) {
		// Ask the user to enter any number from 1-7.
		//Based on the number define the day of the week
		//Example Output:
		//Input a number between 1-7
		//Friday
		//Example Output:
		//Input a number between 1-7
		//Invalid
		
		Scanner input=new Scanner(System.in);
		System.out.println("Input a number between 1-7");
		int day;
		day=input.nextInt();
		String today;
		
		switch(day) {
		case 1:
			today="Monday";
			break;
		case 2:
			today="Tuesday";
			break;
		case 3:
			today="Wednesday";
			break;
		case 4:
			today="Thursday";
			break;
		case 5:
			today="Friday";
			break;
		case 6:
			today="Saturday";
			break;
		case 7:
			today="Sunday";
			break;
			default:
				today="Invalid";
				break;
		
		}
         System.out.println(today);
	}

}
