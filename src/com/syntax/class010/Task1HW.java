package com.syntax.class010;

public class Task1HW {

	public static void main(String[] args) {
		//Create an array of animals and store 6 elements into it. 
		//Using 2 different loops print all elements from the array.
		
		String[] animals= {"dog","cat","bird","fish","turtle","snake"};
		
		for(String an:animals) {
			System.out.print(an+" ");
		}
		System.out.println();
		System.out.println("----------2nd way---------------");
		
		String[] animal=new String[6];
		animal[0]="dog";
		animal[1]="cat";
		animal[2]="bird";
		animal[3]="fish";
		animal[4]="turtle";
		animal[5]="snake";
		
		for (int i=0; i<animal.length; i++) {
			System.out.println(animal[i]);
		}
		
		
  
		
		

	}

}
