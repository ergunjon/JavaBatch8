package com.repl.it.week6;

public class As087 {

	public static void main(String[] args) {
		//Write a program that prints the total number of elements that are negative AND odd
		//3
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		
	int sum=0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]<0 && a[i][j]%2!=0) {
					sum=sum+j;	
			}
		}
	}
		System.out.println(sum);
	}
}


