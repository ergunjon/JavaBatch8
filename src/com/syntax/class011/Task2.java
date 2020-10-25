package com.syntax.class011;

public class Task2 {

	public static void main(String[] args) {
		//Create a 2D array where you will store the following values:
		//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
			//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

		
		String [] [] _array = {{"Mr", "Mrs", "Ms", "Miss",},{"Smith","Jordan", "Jackson", "Obama",}};
		
		System.out.print(_array[0][1]+" "+_array[1][0]+", ");
		System.out.print(_array[0][0]+" "+_array[1][3]+", ");
		System.out.print(_array[0][2]+" "+_array[1][2]+", ");
		System.out.print(_array[0][3]+" "+_array[1][1]);

	}

}
