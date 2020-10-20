package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		// Nested Loops
		//
		
		
		for (int i=1; i<3; i++) { //i++/1+1=2//that means it will repeat 2 times
			System.out.println("I am an outer loop");
			
			for (int y=0; y<=3; y++) { //y++/0+1=1+1+1=3+1=4
				System.out.println("I am an inner loop");
			}
		}

	}

}
