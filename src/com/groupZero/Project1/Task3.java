package com.groupZero.Project1;

public class Task3 {

	public static void main(String[] args) {
		
		 //Write a Java Program to print the first 10 numbers of Fibonacci series.

		int m = 1;
		int n = 1;
		int sum = 0;
		System.out.print(m + " " + n + " ");
		for (int f = 1; f < 9; f++) {
			sum = n + m;
			m = n; // m=1 m = 2 m = 3
			n = sum; // n=2 n = 3 n = 5
			System.out.print(sum + " ");
		}
		System.out.println();
		System.out.println("-------------------");
		
		  int a, b, c, i, n1;
	      n1 = 10;
	      a = b = 1;
	      System.out.print(a+" "+b);
	      for(i = 1; i <= n1-2; i++) {
	         c = a + b;
	         System.out.print(" ");
	         System.out.print(c);
	         a = b;
	         b = c;
	      }

	}

}
