package com.repl.it.week6;

public class As075 {

	public static void main(String[] args) {
		//Write a program that creates an array with the following 
		//values{s, a, y,  b, n, c, t,  d, a, e, x} 
		//Print the values so the output should look like below
		
		char[] array={'s', 'a', 'y', 'b','n','c', 't','d','a','e','x'};
		
		System.out.print(array[0]+""+array[2]+""+array[4]+""+array[6]+""+array[1]+""+array[10]);
		System.out.println();
		System.out.println("--------2nd way--------------");
		
		char[] arr = {'s', 'a', 'y',  'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};

		for (int i = 0; i <= arr.length-1; i+=2) {

			System.out.print(arr[i]);
		}
		

	}

}
