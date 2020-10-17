package com.syntax.class06;

public class Example {

	public static void main(String[] args) {
	
		
		//NOT Operator --> reverse the condition
		boolean isJavaEasy=false;
		
		if(!isJavaEasy) {
			System.out.println("Please try to spend more time with Java");
		}
		
		System.out.println("--------------------------------------------------");
		
		String day="Monday";
		
		if(!day.equals("Sunday") || day.equals("Saturday") ) {
			System.out.println("I am going to work");
		}

	}

}
