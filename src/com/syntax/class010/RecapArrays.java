package com.syntax.class010;

public class RecapArrays {

	public static void main(String[] args) {
		// arrays are container that store data/values of same type
		
		//I have 5 students in the class and i need to calculate the average score;
		
		int[] grades=new int [5];//because 5 students
		grades[0]=98;
		grades[1]=80;
		grades[2]=89;
		grades[3]=67;
		grades[4]=77;
		
		double average=(grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
		
		System.out.println("Average score of my students = "+average);
		
		int a=10;
		int b;
		b=10;
		
		double[] array;
		array=new double[3];
		array[0]=12.99;
		array[1]=10.89;
		array[2]=5.99;
		System.out.println("Value of last element "+array[2]);
		
		String[] liquid=new String[4];//arrays are fixed in size
		liquid[2]="Water";
		liquid[1]="Tea";
		
		System.out.println(liquid[0]);
		
		
	

	}

}
