package com.groupZero.Project1;

public class Task7 {

	public static void main(String[] args) {
		
		// Create a 2D array to store numbers in 3 rows and 4 columns.
		// Develop a program which will identify/print the even numbers only.

	 int[][] numbers = { 
			 { 4, 5, 9, -4568 }, 
			 { 78, 95, 45, 275 }, 
			 { -12, -64, 56824, 56 } 
			 };
	 
		 for (int i = 0; i < numbers.length; i++) {
			 
			for (int j = 0; j < numbers[i].length; j++) {
				
				if (numbers[i][j] % 2 == 0) {
				System.out.print(numbers[i][j] + " ");
			}
				
		}
			
}
		 System.out.println();
		 System.out.println("-----------2nd way---------------");
		 
		 for (int[] nums:numbers) {
			 for(int num:nums) {
				 if(num%2==0) {
					 System.out.print(num+" ");
				 }
			 }
		 }
}

}
