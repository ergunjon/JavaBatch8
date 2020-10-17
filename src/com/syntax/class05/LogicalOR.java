package com.syntax.class05;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
		
		
		
		String day="Sunday";
		
		if(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
			System.out.println("Today I have a Java class at Syntax");
		}else {
		    System.out.println("Today I do not have a Java class at Syntax");
		}
		    System.out.println("----------------more examples-------------");
		    
		    /*if day 1 or 5 = I am off
		     * if day 2 or 3 = GIT classes
		     * if day is 4 = review class
		     * if day 6 or 7 = Java class
		     * everything else will be valid */

		    Scanner scan=new Scanner(System.in);
		    System.out.println("Please enter today's day using numbers only");
		    
		    int today=scan.nextInt();
		    
		    if(today==1 || today==5) {
		    	System.out.println("I am off");
		    }else if(today==2 || today==3) {
		    	System.out.println("GIT class");
		    }else if(today==4) {
		    	System.out.println("Review class");
		    }else if(today==6 || today==7) {
		    	System.out.println("Java class"); 
	        }else {
		        System.out.println("invalid day put something 1-7");
	}
	}
}





