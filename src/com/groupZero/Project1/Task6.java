package com.groupZero.Project1;

public class Task6 {

	public static void main(String[] args) {
		// Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of
		// all numbers.

				int sum = 0;
				int[][] array = { { 4, 5, 9 }, { 78, 95, 45 }, { -12, -64, 56824 } };

				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						sum += array[i][j];
					}

				}
				System.out.println("The sum of all numbers in the array is " + sum);

	}

}
