package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		//it's a way to get input in console
		//Scanner is part of String its non primitive data
		//right click on error Scanner then click import no more error
		//shortcut to import Ctrl+shift+O
		
		int num=80;
		String str="I am String";
		
		Scanner scan=new Scanner(System.in);// enable input to the console
		//I am adding some message to the user
		
		System.out.println("Please enter any text");
		
		String value=scan.nextLine();// waits for your input and once you provided input -->hit ENTER 
		
		System.out.println("I captured value = "+value);
		
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you "+name);
		
		

	}

}
