package com.repl.it.week6;

public class As086 {

	public static void main(String[] args) {
		//Write a program that calculates the sum of elements from each row in a 2D array 
		// and adds them into array of integers
		
		int[][] array = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};

		int sums[] = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < array[i].length; j++) {
				rowSum += array[i][j];
			}
			sums[i] = rowSum;
		}

	for(int sum : sums) {
			System.out.println(sum);
  }
		}
	}


