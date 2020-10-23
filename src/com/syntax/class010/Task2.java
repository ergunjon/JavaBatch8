package com.syntax.class010;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		String[] names=new String[5];
		names[0]="Jack";
		names[1]="Jon";
		names[2]="James";
		names[3]="Alex";
		names[4]="Carlos";
		
		System.out.println(names[1]);
		
		System.out.println("---------2nd way--------");
		
		String[] name= {"Jack","Jon","James","Alex","Carlos"};
		System.out.println(name[1]);
		

	}

}
