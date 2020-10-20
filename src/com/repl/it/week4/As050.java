package com.repl.it.week4;

public class As050 {

	public static void main(String[] args) {
		//Step 1: Initialize the i value as int i=7.

	    //Step 2: Write a program to print a sequence of numbers starting from 7 to 98. 
		
		int i=7;
		
		while(i<=98) {
			if(i%7==0) {
				System.out.println(i);
				
			}
			i++;
		}
		System.out.println("----------------2nd way---------------------------");
		
		int a = 7;
		  while (a <= 98) {
		  			System.out.println (a);
		  			a+=7; 

	}
		  System.out.println("--------------different task--------------------");
		  
		  int b=8;
		  while(b<=100) {
			  System.out.println(b);
			  b+=8;
		  }
}
}


