package com.repl.it.week3;

import java.util.Scanner;

public class As043 {

	public static void main(String[] args) {
		// Write a program to input number "Input a number between 1-12" and 
		//when you input a number it should display the month using Scanner and Switch statement.
        //case: 1 will display January
        //case: 12 will display December
        //Anything outside of 12 will display "Invalid"

		Scanner input=new Scanner(System.in);
		System.out.println("Input a number between 1-12");
	    int month;
	    month=input.nextInt();
	    String answer;
	    
	    switch(month) {
	    case 1:
	    	answer="January";
	    	break;
	    case 2:
	    	answer="February";
	    	break;
	    case 3:
	    	answer="March";
	    	break;
	    case 4:
	    	answer="April";
	    	break;
	    case 5:
	    	answer="May";
	    	break;
	    case 6:
	    	answer="June";
	    	break;
	    case 7:
	    	answer="July";
	    	break;
	    case 8:
	    	answer="August";
	    	break;
	    case 9:
	    	answer="September";
	    	break;
	    case 10:
	    	answer="October";
	    	break;
	    case 11:
	    	answer="November";
	    	break;
	    case 12:
	    	answer="December";
	    	break;
	    	default:
	    		answer="Invalid";
	    		break;
	    	
	    }
	    System.out.println(answer);
	}

}
