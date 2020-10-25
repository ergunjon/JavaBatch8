package com.groupZero.Project1;

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
		
		//Write a java program to find the second largest number in the array?
		

		 int[] array = {1067, 90, 450, -34, 450, 1, 199};
		 
	        int max = array[0];
	        
	        for (int d = 1; d < array.length; d++) {
	            if (array[d] > max) {
	                max = array[d];
	            }
	        }
	        
	        int max2 = 0;
	        
	        for (int q = 0; q < array.length; q++) {
	            if (array[q] == max) {
	                continue;
	            } else if (array[q] > max2) {
	                max2 = array[q];
	            }
	        }
	        System.out.println("second largest number is " + max2);
	        
	        System.out.println("------------------2nd way------------------");
	        
	        int[] array1 = {1067, 90, 450, -34, 450, 1, 199};
			int max1 = array1[0];
			int secondMax = 0;
			for (int i = 1; i < array1.length; i++) {
				if (array1[i] > max1) {
					secondMax = max1;
					max1 = array1[i];
				} else if (array1[i] > secondMax && array1[i] != max1) {
					
					secondMax = array1[i];
				}
			}
			System.out.println(secondMax);
			
			System.out.println("-----------Array sort function---------------------------");
			
			int[] num1 = {1067, 90, 450, -34, 450, 1, 199};
			int length=num1.length;
			Arrays.sort(num1);//stored all the numbers sorted by size 1,3,5,6,10
			System.out.println("Highest number is "+num1[length-1]);
			System.out.println("Second highest number is "+num1[length-2]);
	}

}
