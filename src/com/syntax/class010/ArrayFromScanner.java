package com.syntax.class010;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		
		//lets ask user how many names you would like to store and then store those names
		
		String[] names;
		int size;
		
		Scanner input=new Scanner(System.in);
		System.out.println("How many names would you like to store?");
		size=input.nextInt();
		
		names=new String[size];
		
		//we are storing values into an array
		for(int i=0; i<size; i++) {
			System.out.println("Please enter any name");
			names[i] = input.next();
		}
		//we are retrieving values from an array
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
	
		
		
		
		

	}

}
