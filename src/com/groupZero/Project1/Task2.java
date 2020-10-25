package com.groupZero.Project1;

public class Task2 {

	public static void main(String[] args) {
		
		 //Write a java program to check whether a given number is prime or not?
		
		boolean prime = false;
		int num = 52;
		
		if(num>1) {
		for (int i = 2; i < num; i++) {
			//condition for nonprime member
			if(num % i==0) {
				prime = true;
				break;
			}
		}
		
	}else {
		prime=true;
	}
		if (!prime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	    }
	

	}

