package com.syntax.reviewclass003;

public class LogicalAnd {

	public static void main(String[] args) {
		//& only check one condition
		//&& checks both condition
		
		int number=0;
		if(number>=0) {
			if(number<=100) {
				System.out.println("Number is between 0 and 100");
			}else {
				System.out.println("Number is between 0 and 100");
			}
		}else {
			System.out.println("Go to work");
		}
		
		if(number>=0 && number<=100) {
			System.out.println("Number is between 0 and 100");
		}

	}

}
