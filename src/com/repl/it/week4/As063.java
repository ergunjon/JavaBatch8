package com.repl.it.week4;

import java.util.Scanner;

public class As063 {

	public static void main(String[] args) {
		// Write a for loop that will print out a series of numbers starting at 0 
		//and ending at the x(value must be taken from a user), exclusive.
		
		 Scanner input=new Scanner (System.in);
	     int x ;
	    System.out.print("In:");
	    //write code under on step 8
	   
	    int a=0;
	    for(x=input.nextInt(); a<x; a++) {
	    	System.out.print(a+" ");
	    }
	    

	}

}
