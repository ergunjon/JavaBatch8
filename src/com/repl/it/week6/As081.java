package com.repl.it.week6;

import java.util.Scanner;

public class As081 {

	public static void main(String[] args) {
		//Create an int array of integers with a size of 5 and input values with Scanner. 
		//Don't print prompt questions for a user.
		//Using loop print out each element of the array that should look like the output below
		
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i=0;i<arr.length;i++) {
			arr[i] = input.nextInt();
	}
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]*10);
		}
	
		

	}

}
