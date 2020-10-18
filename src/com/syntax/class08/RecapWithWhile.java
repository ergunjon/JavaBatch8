package com.syntax.class08;

import java.util.Scanner;

public class RecapWithWhile {

	public static void main(String[] args) {
		
		/*ask user to pay for water
		 * water is $5
		 * once user enters money then we need to tell if we need more money or less
		 * once user gives us exact $5 then ==>enjoy your water
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please pay for your water!");
		int money;
		int waterPrices=5;
		money=input.nextInt();
		
		while(money!=waterPrices) {
			if(money>waterPrices) {
				System.out.println("This is too much, you need to enter less money");	
			}else {
				System.out.println("Water is expensive, please insert more money");
			}
			money=input.nextInt();
		}
		System.out.println("Enjoy your water");
		

	}

}
