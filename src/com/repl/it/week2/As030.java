package com.repl.it.week2;

import java.util.Scanner;

public class As030 {

	public static void main(String[] args) {
		// For you to do:
		//Write a program to take the month number from a user. 
		//Provide month name to the corresponding month number
		//If a user provides any number that is out of month range, the program should display "Invalid"

		//IMPORTANT: use Scanner Class

		//Example Output:
		//Please enter month number 1
		//January

		//Example Output:
		//Please enter month number 33
		//Invalid
		
		 Scanner input=new Scanner (System.in);
		 System.out.println("Please enter month number");
		 
		 int mo=input.nextInt();
		 
		 if(mo==1) {
			 System.out.println("January");
		 }else if(mo==2){
			 System.out.println("February");
		 }else if(mo==3){
			 System.out.println("March");
		 }else if(mo==4){
			 System.out.println("April");
		 }else if(mo==5){
			 System.out.println("May");
		 }else if(mo==6){
			 System.out.println("June");
	     }else if(mo==7){
		     System.out.println("July");
	     }else if(mo==8){
		      System.out.println("August");
         }else if(mo==9){
	          System.out.println("September");
         }else if(mo==10){
	         System.out.println("October");
         }else if(mo==11){
	         System.out.println("November");
          }else if(mo==12){
	          System.out.println("December");
          }else {
        	  System.out.println("Invalid");
          }
	}
}
	          
	          
	          
	          
	          