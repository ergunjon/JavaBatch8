package com.repl.it.week3;

import java.util.Scanner;

public class As044 {

	public static void main(String[] args) {
		// Prompt user with questions: "Please enter your favorite car make"
//if user enters  BMW -->  carOrigin = "german car"
//if user enters  Toyota -->  carOrigin = " japanese car"
//if user enters  Maserati -->  carOrigin = "italian car"
//anything else besides those values --> carOrigin = "unknown" 
//The output of your program should be:
//"Your favorite car is ___"
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String car;
		car=input.next();
		String brand, BMW = null, Toyota = null, Maserati;
		
		switch(car) {
		case "BMW":
			brand="german car";
			break;
		case "Toyota":
			brand=" japanese car";
			break;
		case "Maserati":
			brand="italian car";
			break;
			default:
				brand="unknown";
				break;
		}
		System.out.println("Your favorite car is "+brand);

	}

}
