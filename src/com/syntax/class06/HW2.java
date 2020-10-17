package com.syntax.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		//HomeWork: Using scanner class create calculator.
		//Allow user to enter 2 numbers and operator(+,-,*,/). 
		//Based on operator provide the result to user
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 2 numbers");
		int num1, num2, result = 0;
		char operator;
		num1=input.nextInt();
		num2=input.nextInt();
		System.out.println("Please enter (+,-,*,/)");
		operator=input.next().charAt(0);

		switch (operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
			System.out.println("Invalid data");
		}
		
		if(result!=0) {
			System.out.println("Result is = "+result);
		}
		
		
		
	
		
		}
		
		
		}
		

	


