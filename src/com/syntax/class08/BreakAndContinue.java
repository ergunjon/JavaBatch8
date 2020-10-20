package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		//break-keyword 
		//Keywords that can be used inside loops
		//break -->breaks loop and skips all code that you have after break inside the loop
		//continue --> skip 1 iteration/yineleme
		
		for (int i=1; i<4; i++) {
			System.out.println("Hello");
			break; // stop execution
		}
		
		//we want to print numbers from 1 to 10
		//when number is 5 we want to break the loop
		
		for (int i=1; i<=10; i++) {
			
			if(i==5) {
				break;// when you come to 5 stop, other wise it will go till 10
			}
			System.out.println(i);
			
		}

	}

}
