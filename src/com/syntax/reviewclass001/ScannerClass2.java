package com.syntax.reviewclass001;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner=new Scanner(System.in);
		String name;
		int age;
		String day;
		
		System.out.println("Enter your name");
		name=scanner.nextLine();
		System.out.println("Enter Your age");
		age=scanner.nextInt();
		System.out.println("Hi "+name+" you are "+age+" years old");
		day=scanner.nextLine();
		System.out.println("How is your day?");

	}

}
