package com.syntax.class08;

public class ForLoop {

	public static void main(String[] args) {
		// For Loop
		//in 1 line initialize, check condition and increment/decrement
		
		//Good morning 5 times
		for (int i=5; i<=5; i++) {
			System.out.println("Good Morning");
			
		}
		//I want to print number 1 to 100
		//for (start point; end point; increment/decrement) {
		//     code;
		for(int a=1; a<=100; a++) {
			System.out.println(a);
		}

		for(int b=10; b>=10; b--) {
			System.out.println(b);
		}
		System.out.println("What will be output");
		
		for(int i=0; i<=30; i+=3) {
			System.out.println(i);
		}

	}

}
