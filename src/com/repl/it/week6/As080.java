package com.repl.it.week6;

import java.lang.reflect.Array;
import java.util.Scanner;

public class As080 {

	public static void main(String[] args) {
		//Create an array of integers that will store 5 elements taken from a user
		//Don't print any prompt message for the user
		//Then print out all the elements you have created in the first loop in reverse order. 
		
		Scanner input = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);

		}
		
		
	
		
		
		
		
		}
	}


