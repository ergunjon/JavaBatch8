package com.syntax.class010;

public class Task5 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Print all values from the array.
		
		String[] cars= {"Toyota","BMW","Honda","Lexus","Acura","Kia"};
		
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
			
		}
		System.out.println();
		
		System.out.println("-------------getting values from array using enchanced for loop------");
		
		
		// for (variable type then variable : name of the array) {
		
		for (String car : cars) {
			System.out.print(car+" ");
		}
		System.out.println();
		System.out.println("-----------another example---------------");
		
		
		int[] numbers= {10,100,90,600,89} ;
		
		for(int num : numbers) {
			System.out.println(num);
		}
		System.out.println();
		System.out.println("-----------another example---------------");
		
		boolean[] arrayOfBoolean= {true,true,false,true};
		
		for(boolean boo:arrayOfBoolean) {
			System.out.println(boo);
			
		}

	}

}
