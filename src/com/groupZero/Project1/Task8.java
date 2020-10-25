package com.groupZero.Project1;

public class Task8 {

	public static void main(String[] args) {
		
		// Create a 2D array to store numbers and calculate sum of all odd numbers.

				int[][] arr = { 
						{ 4, 5, 9, -4568 }, 
						{ 78, 85, 45, 275 }, 
						{ -12, -64, 56824, 56 } 
						};

				int sum = 0;
				
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						if (arr[i][j] % 2 == 1) {
							sum += arr[i][j];
						}
					}
				}
				System.out.print("The sum of all odd numbers in the array is " + sum);

	}
}
