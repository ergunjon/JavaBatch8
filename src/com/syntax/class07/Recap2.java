package com.syntax.class07;

public class Recap2 {

	public static void main(String[] args) {
		//we can use switch and if else in same coding
		
       String timeOfDay="Morning";
       String day="Saturday";
		
       
		switch (timeOfDay) {
		
		case "Morning":
			System.out.println("Good morning");
			
			if(day.equalsIgnoreCase("Saturday")) {
				System.out.println("Class!");
			}else if(day.equalsIgnoreCase("Monday")) {
				System.out.println("Colleague");
			}
			break;
		case"Noon":
			System.out.println("Good afternoon");
			break;
		case"Evening":
			System.out.println("Good Evening");
			break;
		case"Night":
			System.out.println("Good Night");
			break;
			default:
				System.out.println("N/A");

	}

}
}
