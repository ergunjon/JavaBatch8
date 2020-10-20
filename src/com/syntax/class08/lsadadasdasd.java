package com.syntax.class08;

import java.util.Scanner;

public class lsadadasdasd {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter item you want to buy.");
		String item=input.next();
		System.out.println("Please enter the price");
		int price=input.nextInt();
		int actualPrice = 500;
		int leftoff=actualPrice-price;
		int change=price-actualPrice;
		
		while(actualPrice>price; price+=500) {
			System.out.println("More money"+leftoff);
			price=input.nextInt();
			if(price==actualPrice) {
				System.out.println("Thanks for shopping");
			}else if(price>actualPrice) {
				System.out.println(change);
			}
		}

	}

	private static int price(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
