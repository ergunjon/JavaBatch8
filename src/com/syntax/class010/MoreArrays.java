package com.syntax.class010;

public class MoreArrays {

	public static void main(String[] args) {
		
		char [] grades = {'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		
		String[] name= {"Jack","Jon","James","Alex","Carlos"};
		System.out.println(name[1]);
		
		System.out.println("-------------  -------------------------");
		//get all values from grade array
		for (int i=0; i<grades.length; i++) {
			
			char valueFromArray=grades[i];
			
			System.out.println(valueFromArray);
		}

	}

}
