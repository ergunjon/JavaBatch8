package com.syntax.class02;

public class Taskforpractice {

	public static void main(String[] args) {
	
		//Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		//Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”
		
		double yarrak=12.58;
		double kyo=56.28;
		double ilki=yarrak*kyo;
		double ikinci=yarrak/kyo;
		
		System.out.println("The multiply of 2 numbers "+yarrak +" and "+kyo +" is equal to "+ilki);
		System.out.println("The divide of 2 numbers "+yarrak +" and "+kyo +" is equal to "+ikinci);
		
		
		//Write a program to find the square of the number 3.9. 
		//You program should say “The square of the ____ is ____ ”
		
		double alexis=3.9;
		double alexa=alexis*alexis;
		System.out.println("The square of the "+alexis+" is "+alexa);


		//Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
		//Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
		
		 int width=5;
		 int height=8;
		 int perimeter=2*(width+height);
		 int area=width*height;
		 
		 System.out.println("The perimeter of a rectangle with "+width+" and "+height+" is equal to "+perimeter+" and the area is "+area);

	}

}
