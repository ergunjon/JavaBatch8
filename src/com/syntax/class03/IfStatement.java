package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		//Control Flow;
		//if statement 
		//syntax for if statement
		//if (boolean expression is true) {
		//     syso...............
		//}else{
		//     syso..........
		
		int num1=180;
		int num2=900;
		
		System.out.println("Writing my first if statement");
		
		//if the condition is true it will print
		if(num1>num2) {
		System.out.println("Num1 is bigger than num2");
		}else {
		System.out.println("Num1 is smaller than num2");
		}
		
		System.out.println("End of if statement");
		
		System.out.println("------------------------------------");
		
		int temp=80;
		
		if (temp>=80) {
		System.out.println("I am going to the beach");
		}else {
		System.out.println("I will go for a walk");
		}	
		
		System.out.println("------------------------------------");
			
		double expectedHours=15;
		double actualHours=2;
			
		if(actualHours>=expectedHours) {
		System.out.println("You will love the course and you will succeed");
		}else {
		System.out.println("Course will be too hard for you");
		}
		//to debug:
		//1. place breakpoint at any line you would like to start debugging
		//2. right click-->debug
		//3. if some window pops up --> click on swithc
		//4. and then click on step over to debug line by line
		//5. if you want to stop debuggin click on red square
			
			}
		
	}

