package com.repl.it.week6;

public class As074 {

	public static void main(String[] args) {
		//Write a program that creates an array of integers that stores the following values: 
		//45,78, 12,  67, 55, 89, 23, 77, 88
		//Print only values that stored with even index including 0.
		
		int numbers[]=new int[9];
		numbers[0]=45;
		numbers[1]=78;
		numbers[2]=12;
		numbers[3]=67;
		numbers[4]=55;
		numbers[5]=89;
		numbers[6]=23;
		numbers[7]=77;
		numbers[8]=88;
		
		System.out.print(numbers[0]+" "+numbers[2]+" "+numbers[4]+" "+numbers[6]+" "+numbers[8]);

		System.out.println();
		System.out.println("----------2nd way-------------");
		
		int[] arr = {45,78, 12,  67, 55, 89, 23, 77, 88};

		for (int i = 0; i < arr.length; i+=2) {

			System.out.print(arr[i] + " ");
		}
	}

}
