package com.repl.it.week4;

import java.util.Scanner;

public class As065 {

	public static void main(String[] args) {
		//Write a for loop that will print out a series of numbers starting at one less than x 
		//and ending at 0.
		
		 Scanner input=new Scanner(System.in);
		    int x;
		    System.out.print("In:");
		    //write your code below
		    x=input.nextInt();
		    
		    for(int a=0; x>a; x--) {
		    	int b=x-1;
		    	System.out.print(b+" ");
		    }
		    

	}

}
