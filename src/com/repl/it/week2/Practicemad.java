package com.repl.it.week2;

import java.util.Scanner;

public class Practicemad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Whats your age");
		int age=input.nextInt();
		
		
		if(age>65) {
			System.out.println("Go home grandpa!");
		}else if(age>20) {
			System.out.println("Enjoy your drink!");
		}else if(age>18) {
				System.out.println("You can enter but you cant drink");
		}else if (12>age) {
			System.out.println("Where is your mom ?");
		
		
		}else{
			System.out.println("No entery come back in few years!");
		
		

	}
	}
}



