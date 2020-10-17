package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. 
		//Once values are captured print which language user speaks
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter your country");
		String country, language;
		country=input.next();
		
		
	     switch(country) {
			
		case ("Germany"):
			language="German";
			break;
		case ("France"):
			language="French";
			break;
		case ("America"):
			language="English";
			break;
		case ("Italy"):
			language="Italian";
			break;
		case ("Turkey"):
			language="Turkish";
		    break;
		default: 
			language="Not Acceptable";
			}
			System.out.println("You are from "+country+" and you speak " +language);
		}
		
	
		
		

	}


