package com.syntax.class05;

import java.util.Scanner;

public class Task5_Improved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program for user to enter his/hers birth month. Based on the month define the season.
		//Example: if user is born in June, July or August → season =”Summer”.
		//At the end of the program we should see output as “You were born ______”.
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month;
		String season=null;
		month=input.next();
		
		if(month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("December"))  {
			season="Summer";
		}else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			season="Spring";
		}else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			season="Summer";
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			season="Autumn";
		}else {
			season="Invalid";
	}
		System.out.println("You were born in "+season);

}
}