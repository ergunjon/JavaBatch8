package com.repl.it.week6;

public class As084 {

	public static void main(String[] args) {
		//Write a program that prints the highest value in the array.
		
		int [][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,15,2}
			};
		
		int max=a[0][0];
		
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
			if(a[i][j]>max) {
				max=a[i][j];
		}

	}
		

		}
		System.out.println(max);
	}
}

