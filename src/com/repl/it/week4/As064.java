package com.repl.it.week4;

import java.util.Scanner;

public class As064 {

	public static void main(String[] args) {
		
		//Write a for loop that will print out a series of numbers 
		//starting at 0 and ending at the doubled value of end(value must be taken from a user), exclusive.

        //Each number should be on the same line, separated by a space. 
		
		 Scanner input=new Scanner(System.in);
		    int end;
		    System.out.print("Int:");
		    //write your code below
		    end=input.nextInt();
		    
		    
		    if(end>0) {
		    for(int a=0; end*2>a; a++) {
		    	System.out.print(a+" ");
		    }
		    }else{
		    		System.out.println("(no output)");
		    		
		    	}
		    	
		    }

	}


