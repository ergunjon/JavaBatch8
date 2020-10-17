package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//Prompt the user to enter person heights in inches. 
		//Person should be classified as one of the following:
		//short (under 60 inch)
		//medium(between 60 -72 inch)
		//tall (over 72 inch)
		//---------------------------------------------------------------------------------------------
		//Write a program that will print whether it is a weekend or weekday. 
		//If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”,
		//any other day → output “Invalid day”
		//---------------------------------------------------------------------------------------------
		
		int height;
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter your height");
		height=input.nextInt();
		
		if(height<=60) {
			System.out.println("short");
		}else if(height>=60 && height<=72) {
			System.out.println("medium");
		}else if(height>72) {
			System.out.println("tall");
			
		}
		System.out.println("--------------------------------------------------------");
		
		int day;
		System.out.println("what day is today?");
		day=input.nextInt();
		
		if(day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("It is a weekday");
		}else {
			if(day==6 || day==7) {
				System.out.println("It is a weekday");
			}else {
				System.out.println("Invalid day");
			}
		}

	}

}
