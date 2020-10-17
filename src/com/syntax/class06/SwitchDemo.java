package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * lets ask a tester on which browser they would like to use
		 * 
		 */
		//switch works with byte, short, char,int and String
		//switch case cannot use relational or logical operators
		//switch cannot work with double, float,long
		//switch(L) {CE:Cannot switch on a value of type long.

		String browser;
		String message;
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter a browser");
		browser=input.nextLine();
		
		switch(browser.toLowerCase()) {//toLowerCase whatever you type treated as lower case
		
		case "safari":
			message="Your code will be executed on Safari browser";
			break;
		case"chrome":
			message="Your code will be executed on Chrome browser";
			break;
		case"firefox":
			message="Your code will be executed on Firefox browser";
			break;
		default: 
			message="Entered browser is not supported";
		}
		System.out.println(message);
		}
	}


