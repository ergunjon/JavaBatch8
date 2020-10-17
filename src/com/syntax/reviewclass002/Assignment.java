package com.syntax.reviewclass002;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct numbers");
		
		int num1 = userIn.nextInt();
		int num2 = userIn.nextInt();
		int num3 = userIn.nextInt();
		
		if (num1>=num2) {
			
			if(num1>=num3) {
			System.out.println("The largest number is "+num1);
		}
		}if (num2>=num1) {
			if(num2>=num3) {
			System.out.println("The largest number is  "+num2);
		}
	}if (num3>=num1) {
			if (num3>=num2) {
		       System.out.println("The largest number is "+num3);
			}
	}
	}

	}


