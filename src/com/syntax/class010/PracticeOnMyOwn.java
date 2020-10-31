package com.syntax.class010;

import java.util.Scanner;

public class PracticeOnMyOwn {

	public static void main(String[] args) {
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		char[] grades= {'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		
		System.out.println("----------------------");
		
		char[]grades1=new char[6];
		grades1[0]='A';
		grades1[1]='B';
		grades1[2]='C';
		grades1[3]='D';
		grades1[4]='E';
		grades1[5]='F';
		
		System.out.println(grades1[1]);
		
		System.out.println("-------------2nd task------------------------------");
		
		//Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		String[] names=new String[5];
		names[0]="Alex";
		names[1]="Alexis";
		names[2]="Alexa";
		names[3]="Alexandria";
		names[4]="Alixis";
		for(int i=0; i<names.length; i++) {
		System.out.println(names[i]);
		}
		System.out.println("---------2nd way------------------");
		
		String name[]={"Alex","Alexis","Alexa","Alexandria","Alixis"};
		for(int a=0; a<name.length; a++) {
			System.out.print(name[a]+" ");
		}
		System.out.println();
	
		System.out.println("------------3rd task-----------------------------");
		
		// Create an array of cars and store 6 elements into it. Print all values from the array.
		
		String[]cars= {"Toyota","Honda","Lexus","Acura","Subaru","Nissan"};
		
		for(int b=0; b<cars.length; b++) {
			System.out.print(cars[b]+" ");
		}
		System.out.println();
		for(String brands:cars) {
			System.out.print(brands+" ");
		}
		System.out.println();
		System.out.println("-------------4th task----------------------------");
		//Create an array of animals and store 6 elements into it. 
		//Using 2 different loops print all elements from the array.
		
		String animals[]= {"dog","cat","bird","snake","turtle"};
		for(int x=0; x<animals.length; x++) {
			System.out.print(animals[x]+" ");
			System.out.println();
		}
		String animal[]=new String [5];
		animal[0]="dog";
		animal[1]="cat";
		animal[2]="bird";
		animal[3]="snake";
		animal[4]="turtle";
		
		for(int z=0; z<animal.length; z++) {
			System.out.print(animal[z]+" ");
		}
		System.out.println();
		
		System.out.println("----------5th task--------------------------------");
		
		//Create an array on double using scanner and calculate the sum of all elements 
		//that was stored in an array.
		
		Scanner input=new Scanner(System.in);
		System.out.println("How many numbers you will enter?");
		int size=input.nextInt();
		
		
		System.out.println("-----------------6th task--------------------------");
		
		//Create an array of countries.
		//While retrieving all values from an array print capital for each country. 
		//(use 2 different loops).
		
		String country[] = {"Turkey","Iran","Iraq","Syria"};
		String capital[] = {"Ankara","Tehran","Baghdad","Hatay"};
		for(int r=0; r<country.length; r++) {
				System.out.println("Capital of "+country[r]+" is "+capital[r]);
			}
		System.out.println("------------------2nd way-------------------");
		
		String capitals = null;
		
		for(String countries:country) {
			
			switch(countries) {
			
			case"Turkey":
				capitals="Ankara";
				break;
			case"Iran":
					capitals="Tehran";
					break;
			case"Iraq":
				capitals="Baghdad";
				break;
			case"Syria":
				capitals="Hatay";
				break;
				default:
					capitals="I dont know";
					
			}
			System.out.println("The capital of "+countries+" is "+capitals);
		
		
		
		}
		
		
		
		
		
		
		
		
		

	}
}


