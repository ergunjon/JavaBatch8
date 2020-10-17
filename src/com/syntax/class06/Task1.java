package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// we are thinking of going to shopping
		//first we check is store has sale;
		//    if no sale---no shopping
		//    if sale---go for shopping
		//              ask for price
		//              if price is between 10-50-------%10 discount
		//              if price is between 50-100------%20 discount
		//              if price is between 100-500-----%40 discount
		//              if price is more than 500-------%50 discount
		
		//program should calculate final price after discount
		
		Scanner input=new Scanner (System.in);
		System.out.println("check if store has sale");
		
		boolean sale=true;
		sale=input.nextBoolean();
		double  price = 0 ;
		double discount = 0;
		double finalPrice = 0;
	
		
		if(!sale ) {
			System.out.println("No shopping");
	}else {
		System.out.println("Please enter the price");
		price=input.nextInt();
		
	    if (price>10 && price<50){
		discount=(price*0.10);
	    }else if (price>50 && price<100) {
		discount=(price*0.20);
	    }else if(price>100 && price<500) {
		discount=(price*0.40);
	    }else if(price>500) {
		discount=(price*0.50);	
	    }else {
	    	discount=0;
	    }
	    
	}
		finalPrice=price-discount;
		 System.out.println("Your price is $"+price+" your discount amount is $"+discount+" and your final price is $"+finalPrice);
		 finalPrice=input.nextDouble();
	
	}
}

			
			
		
		
	
