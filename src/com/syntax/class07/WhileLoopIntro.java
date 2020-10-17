package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		
		//initialize variable;
		
		//while(true) {
		//code;
		//increment/decrement;
		
		String day="Saturday";
		
		if(day.equals("Saturday")) {
			System.out.println("My fav Java class");
		}
		
		while(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Monday")) {
			System.out.println("My favorite Java class");// infinite because its always true
			day="Sunday";
		}
		System.out.println("------------------------------");
		
		boolean isItBreakTime=true;
		
		if(isItBreakTime) {
		     System.out.println("I will get tea");//only once
		}
		while(isItBreakTime) {
			System.out.println("I will get tea");//infinite
			isItBreakTime=false;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
