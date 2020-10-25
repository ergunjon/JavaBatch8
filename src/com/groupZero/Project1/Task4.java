package com.groupZero.Project1;

public class Task4 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int[] array = {895, 5, 7, 89, 452 };
		
		int max = array[0];
		int min = array[0];
		
		for (int d = 1; d < array.length; d++) {
			if (array[d] > max) {
				max = array[d];
			} 
			if(array[d]<min) {
				min=array[d];
				
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The lowest number is "+min);
		

		

	}

}
