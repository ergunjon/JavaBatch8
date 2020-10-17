package com.repl.it.week3;

import java.util.Scanner;

public class As040 {

	public static void main(String[] args) {
		// First Output: "Enter name of the instructor"

//case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
//case 2: if User provided the name as Moazam as input it should show  "Will take care of SDLC Assignment"
//case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
//case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"
//Other than these four names if the user provides any other names --> " Invalid instructor selected"

		Scanner input=new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		String name=input.next();
		
		if(name.equals("Asghar")) {
			System.out.println("Asghar will take care of Java Assignment");
		}else if(name.equals("Moazam")) {
			System.out.println("Moazam will take care of SDLC Assignment");
		}else if(name.equals("Weqas")) {
			System.out.println("Weqas will take care of Selenium Assignment");
		}else if(name.equals("Asel")) {
			System.out.println("Asel will take care of every Assignment");
		}else {
		System.out.println("Invalid instructor selected");
		
	}
}
}	
		
		
		
		
		
		
		
		
		
		
	


