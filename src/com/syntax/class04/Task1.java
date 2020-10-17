package com.syntax.class04;

public class Task1 {

	public static void main(String[] args) {
		//1-Create a Java program and declare int variable that will hold a month. 
		//Based on the value of the variable your program should print the name of the month.
		//2-Write a program to check whether number is positive or negative.
		//3-Write a Java Program to check whether number is Even or Odd.
		
		int month=5;
		
		if(month==1) {
			System.out.println("Month Jan");
		}else if(month==2) {
			System.out.println("Monh Feb");
		}else if(month==3) {
			System.out.println("Month Mar");
		}else if(month==4) {
			System.out.println("Month Apr");
		}else if(month==5) {
			System.out.println("Month May");
		}else if(month==6) {
			System.out.println("Month Jun");
		}else if(month==7) {
			System.out.println("Month Jul");
		}else if(month==8) {
			System.out.println("Monh Aug");
		}else if(month==9) {
			System.out.println("Month Sept");
		}else if(month==10) {
			System.out.println("Month Oct");
		}else if(month==11) {
			System.out.println("Month Nov");
		}else if(month==12) {
			System.out.println("Month Dec");
		}
		
		System.out.println("------------TASK 2------------------");
		
		int a = -1;
		int b = 0;
		if (a > b) {
			System.out.println("It’s a Positive Number");
		} else if (a < b) {
			System.out.println("It’s a Negative number");
		} else {
			System.out.println("You number is 0");
		}
		System.out.println("--------------TASK 3-------------------");
		// task-3:
		int myNumber = 51;
		int condition = 2;
		
		if (myNumber % condition == 0) {
			System.out.println("It’s an Even Number");
		} else {
			System.out.println("It’s an Odd number");
		}
	}

}
