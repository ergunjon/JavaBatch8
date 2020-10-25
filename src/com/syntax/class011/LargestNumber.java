package com.syntax.class011;

public class LargestNumber {

	public static void main(String[] args) {
		
		//I would like to find largest number from the array
		int[] array= {7,0,20,8,-1,77,56};
		
		int max=array[0];//I am assuming first element is the largest one
		
		for(int i=1; i<array.length; i++) { //i=1 because we took 0 already
			
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("The largest number from an array is "+max);
		
		int min=array[1];
		for(int i=0; i<array.length; i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("The lowest number is "+min);

	}

}
