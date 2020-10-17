package com.repl.it.week2;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=(int)9.999;//narrowing
		System.out.println(i);
	
	
	   int a=(int)500.444;
	    
	    System.out.println(a);
	    
	    Scanner input=new Scanner(System.in);
	    System.out.println("M or F");
	    String gender=input.next();
	    System.out.println("Wahts age?");
	    int age=input.nextInt();
	    
	    if(gender=="M") {
	    	if(age>25) {
	    		System.out.println("Man");
	    	}else {
	    		System.out.println("Boy");
	    	}
	    }else {
	    	if(gender=="F") {
	    	if(age>25) {
	    		System.out.println("Woman");
	    	}else {
	    		System.out.println("Girl");
	    	}
	    }
	    }
	}
}
	   
	    
	    
	
