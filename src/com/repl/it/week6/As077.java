package com.repl.it.week6;

public class As077 {

	public static void main(String[] args) {
		//Write a program that creates an array of integers of size 11. 
		//Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values. 

		int size[]=new int[11];
		
		for(int i=0; i<=size.length-1; i++) {
			size[i]=2010+i;
		}
			for(int i=0; i<size.length; i++) {
				System.out.println(size[i]);
				
			}
		}
	}


