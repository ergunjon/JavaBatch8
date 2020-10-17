package com.syntax.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
	//You are working in sales and have to calculate commission for the employees;
    //You need to ask user a sales amount and based on the amount you need to define their commission
           //if user sold products for more than $10 but less than 100 --> commission is 10%
           //if sales is more than 100 but less then 200 --> commission is 20%
           //if sales is more than 200 but less then 500 --> commission is 30%
          //if sales is more than 500 --> commission is 50%
    //You program should print How much in commission user will get
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		int sales=input.nextInt();
		
		if(sales>=10 && sales<100) {
			System.out.println("Your commission is $"+(sales*0.10));
		}else if(sales>=100 && sales<200) {
			System.out.println("Your commission is $"+(sales*0.20));
		}else if(sales>=200 && sales<500) {
			System.out.println("Your commission is $"+(sales*0.30));
		}else if(sales>=500) {
			System.out.println("Your commission is $"+(sales*0.50));
		}else {
			System.out.println("Sorry no commission for you");
		}

	}

}
