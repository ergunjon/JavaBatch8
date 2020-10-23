package com.syntax.reviewclass004;

import java.util.Scanner;

public class WhileLoopWithSwitch {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		char operation;
		double results;
		boolean continueLoop=true;
		String end;
		
		while (continueLoop) {
		System.out.println("Please enter two numbers");
		Scanner input=new Scanner(System.in);
		num1=input.nextDouble();
		num2=input.nextDouble();
		System.out.println("Please enter the operation +,-,*,/ ");
		operation=input.next().charAt(0);
		if(!(operation=='+'|| operation=='-' || operation=='*' || operation=='/')) {
			System.out.println("Operation not supported");
			continue;
		}
			
		switch(operation) {
		case '+':
			results=num1+num2;
			break;
		case '-':
			results=num1-num2;
			break;
		case '*':
			results=num1*num2;
			break;
		case '/':
			results=num1/num2;
			break;
			default:
				results=0;
			
		}
		System.out.println("Result is "+results);
		System.out.println("Enter Yes to perform more operations and No to terminate the program");
		end=input.next();
		if("No".equalsIgnoreCase(end)) {
			continueLoop=false;
		}
	

	}

}
}

