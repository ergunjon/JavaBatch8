package com.syntax.reviewclass003;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		String pass="pass123";
		double accountBalance=10000;
		
		Scanner input=new Scanner(System.in);
		double transferAmount=500;
		System.out.println("Welcome to Chase");
		System.out.println("Please enter your password");
		pass=input.next();
		
		if("pass123".equalsIgnoreCase(pass) || pass.equals("pass123")) {
			System.out.println("Please enter the amount that you want to transfer");
			transferAmount=input.nextDouble();
			if(transferAmount>accountBalance) {
				System.out.println("Not enough funds");
			}else {
				System.out.println("Transfer is completed. Remaining balance is $"+(accountBalance-transferAmount));
			}
		}else {
			System.out.println("Sorry try again Invalid credentials");

	}

}
}
