package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
		
		double money=556423;
		double iceCream=5.59;
		
		if (money>=iceCream) {
			System.out.println("I am buying ice cream");
			System.out.println("I would like vanilla flavor");
		}else {
			System.out.println("Sorry sis, no ice cream for you today");
			System.out.println("Do not worry, less sugar for you sis");
		}
		
		System.out.println("I am code that executes without any condition");
		System.out.println("-----------------------------------------------");
		
		boolean sleepy=false;
		//if not sleepy--> I will study otherwise i will take a nap
		
		if (sleepy=true) {
			System.out.println("I will take a nap");
		}else {
			System.out.println("I will study");
		}
			
	   System.out.println("-------------------");
			
		boolean hungry=true;
		if (hungry) {
			System.out.println("I will go eat");
		}else {
			System.out.println("I will keep study");
		}

	}
}
